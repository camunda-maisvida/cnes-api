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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude}FiltroLocalizacaoEstabelecimentoSaude"/&gt;
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
    "filtroLocalizacaoEstabelecimentoSaude"
})
@XmlRootElement(name = "requestLocalizarEstabelecimentoSaude")
public class RequestLocalizarEstabelecimentoSaude {

    @XmlElement(name = "FiltroLocalizacaoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", required = true)
    protected FiltroLocalizacaoEstabelecimentoSaudeType filtroLocalizacaoEstabelecimentoSaude;

    /**
     * Filtro de Localização.
     * 
     * @return
     *     possible object is
     *     {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public FiltroLocalizacaoEstabelecimentoSaudeType getFiltroLocalizacaoEstabelecimentoSaude() {
        return filtroLocalizacaoEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade filtroLocalizacaoEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public void setFiltroLocalizacaoEstabelecimentoSaude(FiltroLocalizacaoEstabelecimentoSaudeType value) {
        this.filtroLocalizacaoEstabelecimentoSaude = value;
    }

}
