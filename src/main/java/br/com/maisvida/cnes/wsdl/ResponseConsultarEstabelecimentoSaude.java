//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.12.12 às 02:27:07 PM BRT 
//


package br.com.maisvida.cnes.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes}DadosGeraisEstabelecimentoSaude" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dadosGeraisEstabelecimentoSaude"
})
@XmlRootElement(name = "responseConsultarEstabelecimentoSaude")
public class ResponseConsultarEstabelecimentoSaude {

    @XmlElement(name = "DadosGeraisEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes")
    protected DadosGeraisEstabelecimentoSaudeType dadosGeraisEstabelecimentoSaude;

    /**
     * Obtém o valor da propriedade dadosGeraisEstabelecimentoSaude.
     * 
     * @return
     *     possible object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public DadosGeraisEstabelecimentoSaudeType getDadosGeraisEstabelecimentoSaude() {
        return dadosGeraisEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade dadosGeraisEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public void setDadosGeraisEstabelecimentoSaude(DadosGeraisEstabelecimentoSaudeType value) {
        this.dadosGeraisEstabelecimentoSaude = value;
    }

}
