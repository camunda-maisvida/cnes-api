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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PaginacaoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaginacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="posicaoRegistroInicio" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero"/&gt;
 *         &lt;element name="quantidadeRegistrosPorPagina" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero"/&gt;
 *         &lt;element name="quantidadeRegistros" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginacaoType", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao", propOrder = {
    "posicaoRegistroInicio",
    "quantidadeRegistrosPorPagina",
    "quantidadeRegistros"
})
public class PaginacaoType {

    @XmlElement(required = true)
    protected String posicaoRegistroInicio;
    @XmlElement(required = true)
    protected String quantidadeRegistrosPorPagina;
    protected String quantidadeRegistros;

    /**
     * Obtém o valor da propriedade posicaoRegistroInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicaoRegistroInicio() {
        return posicaoRegistroInicio;
    }

    /**
     * Define o valor da propriedade posicaoRegistroInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicaoRegistroInicio(String value) {
        this.posicaoRegistroInicio = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeRegistrosPorPagina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantidadeRegistrosPorPagina() {
        return quantidadeRegistrosPorPagina;
    }

    /**
     * Define o valor da propriedade quantidadeRegistrosPorPagina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeRegistrosPorPagina(String value) {
        this.quantidadeRegistrosPorPagina = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeRegistros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Define o valor da propriedade quantidadeRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeRegistros(String value) {
        this.quantidadeRegistros = value;
    }

}
