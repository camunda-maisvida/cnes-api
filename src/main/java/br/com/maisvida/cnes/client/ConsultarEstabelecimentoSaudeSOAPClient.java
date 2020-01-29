package br.com.maisvida.cnes.client;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maisvida.cnes.wsdl.CNPJType;
import br.com.maisvida.cnes.wsdl.CodigoCNESType;
import br.com.maisvida.cnes.wsdl.DadosGeraisEstabelecimentoSaudeType;
import br.com.maisvida.cnes.wsdl.FiltroPesquisaEstabelecimentoSaudeType;
import br.com.maisvida.cnes.wsdl.RequestConsultarEstabelecimentoSaude;
import br.com.maisvida.cnes.wsdl.ResponseConsultarEstabelecimentoSaude;
import io.micrometer.core.instrument.util.StringUtils;

@Service
public class ConsultarEstabelecimentoSaudeSOAPClient {

	@Autowired
	private SOAPConnector soapConnector;

	public DadosGeraisEstabelecimentoSaudeType consultarEstabelecimentoPorCnpj(String cnpj) {
		if(StringUtils.isBlank(cnpj)) {
			return null;
		}
		
		RequestConsultarEstabelecimentoSaude request = new RequestConsultarEstabelecimentoSaude();
		FiltroPesquisaEstabelecimentoSaudeType filtro = new FiltroPesquisaEstabelecimentoSaudeType();
		CNPJType cnpjType = new CNPJType();
		cnpjType.setNumeroCNPJ(cnpj);
		filtro.setCNPJ(cnpjType);
		request.setFiltroPesquisaEstabelecimentoSaude(filtro);
		Object callWebService = soapConnector.callWebService("https://servicoshm.saude.gov.br/cnes/EstabelecimentoSaudeService/v1r0/consultarEstabelecimentoSaude", request);
		ResponseConsultarEstabelecimentoSaude response = (ResponseConsultarEstabelecimentoSaude) callWebService;
		return response.getDadosGeraisEstabelecimentoSaude();
	}

	public DadosGeraisEstabelecimentoSaudeType consultarEstabelecimentoPorCodigo(@NotBlank String codigo) {

		if(StringUtils.isBlank(codigo)) {
			return null;
		}
		
		RequestConsultarEstabelecimentoSaude request = new RequestConsultarEstabelecimentoSaude();
		FiltroPesquisaEstabelecimentoSaudeType filtro = new FiltroPesquisaEstabelecimentoSaudeType();
		CodigoCNESType codigoCNESType = new CodigoCNESType();
		codigoCNESType.setCodigo(codigo);
		filtro.setCodigoCNES(codigoCNESType);
		request.setFiltroPesquisaEstabelecimentoSaude(filtro);
		ResponseConsultarEstabelecimentoSaude response = (ResponseConsultarEstabelecimentoSaude) soapConnector.callWebService("https://servicoshm.saude.gov.br/cnes/EstabelecimentoSaudeService/v1r0/consultarEstabelecimentoSaude", request);
		return response.getDadosGeraisEstabelecimentoSaude();
	}
}
