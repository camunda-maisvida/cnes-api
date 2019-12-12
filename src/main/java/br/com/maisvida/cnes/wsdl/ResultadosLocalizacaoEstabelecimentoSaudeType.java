//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.12.12 às 02:27:07 PM BRT 
//


package br.com.maisvida.cnes.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResultadosLocalizacaoEstabelecimentoSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResultadosLocalizacaoEstabelecimentoSaudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadolocalizacaoestabelecimentosaude}ResultadoLocalizacaoEstabelecimentoSaude" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}Paginacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadosLocalizacaoEstabelecimentoSaudeType", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadoslocalizacaoestabelecimentosaude", propOrder = {
    "resultadoLocalizacaoEstabelecimentoSaude",
    "paginacao"
})
public class ResultadosLocalizacaoEstabelecimentoSaudeType {

    @XmlElement(name = "ResultadoLocalizacaoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadolocalizacaoestabelecimentosaude")
    protected List<ResultadoLocalizacaoEstabelecimentoSaudeType> resultadoLocalizacaoEstabelecimentoSaude;
    @XmlElement(name = "Paginacao", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao")
    protected PaginacaoType paginacao;

    /**
     * Lista de Estabelecimentos de Saúde Localizados Gets the value of the resultadoLocalizacaoEstabelecimentoSaude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultadoLocalizacaoEstabelecimentoSaude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultadoLocalizacaoEstabelecimentoSaude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultadoLocalizacaoEstabelecimentoSaudeType }
     * 
     * 
     */
    public List<ResultadoLocalizacaoEstabelecimentoSaudeType> getResultadoLocalizacaoEstabelecimentoSaude() {
        if (resultadoLocalizacaoEstabelecimentoSaude == null) {
            resultadoLocalizacaoEstabelecimentoSaude = new ArrayList<ResultadoLocalizacaoEstabelecimentoSaudeType>();
        }
        return this.resultadoLocalizacaoEstabelecimentoSaude;
    }

    /**
     * Resposta da paginação
     * 					
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoType }
     *     
     */
    public PaginacaoType getPaginacao() {
        return paginacao;
    }

    /**
     * Define o valor da propriedade paginacao.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoType }
     *     
     */
    public void setPaginacao(PaginacaoType value) {
        this.paginacao = value;
    }

}
