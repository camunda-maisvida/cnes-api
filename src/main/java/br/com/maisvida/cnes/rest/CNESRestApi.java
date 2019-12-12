package br.com.maisvida.cnes.rest;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.maisvida.cnes.client.ConsultarEstabelecimentoSaudeSOAPClient;
import br.com.maisvida.cnes.wsdl.DadosGeraisEstabelecimentoSaudeType;

@RestController
@Validated
public class CNESRestApi {
	
	@Autowired
	private ConsultarEstabelecimentoSaudeSOAPClient client;

	@GetMapping(value = "/cnes/estabelecimento/cnpj/{cnpj}")
	public ResponseEntity<DadosGeraisEstabelecimentoSaudeType> buscarPorCnpj(@NotBlank @Size(min = 14, max = 14) @PathVariable(value = "cnpj") String cnpj) {
		
		DadosGeraisEstabelecimentoSaudeType response = client.consultarEstabelecimentoPorCnpj(cnpj);
		
		return response == null 
				? ResponseEntity.notFound().build() 
						: new ResponseEntity<DadosGeraisEstabelecimentoSaudeType>(response, HttpStatus.OK);
	}

	@GetMapping(value = "/cnes/estabelecimento/codigo/{codigo}")
	public ResponseEntity<DadosGeraisEstabelecimentoSaudeType> consultarPorCodigo(@NotBlank @PathVariable(value = "codigo") String codigo) {
		
		DadosGeraisEstabelecimentoSaudeType response = client.consultarEstabelecimentoPorCodigo(codigo);
		
		return response == null 
				? ResponseEntity.notFound().build() 
						: new ResponseEntity<DadosGeraisEstabelecimentoSaudeType>(response, HttpStatus.OK);
	}
}
