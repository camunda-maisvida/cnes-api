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
 * <p>Classe Java de NaturezaJuridicaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NaturezaJuridicaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoNaturezaJuridica"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descricaoNaturezaJuridica"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="codigoNaturezaJuridicaConcla"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tipoNaturezaJuridica" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/tiponaturezajuridica}TipoNaturezaJuridicaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturezaJuridicaType", namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/naturezajuridica", propOrder = {
    "codigoNaturezaJuridica",
    "descricaoNaturezaJuridica",
    "codigoNaturezaJuridicaConcla",
    "tipoNaturezaJuridica"
})
public class NaturezaJuridicaType {

    @XmlElement(required = true)
    protected String codigoNaturezaJuridica;
    @XmlElement(required = true)
    protected String descricaoNaturezaJuridica;
    @XmlElement(required = true)
    protected String codigoNaturezaJuridicaConcla;
    @XmlElement(required = true)
    protected TipoNaturezaJuridicaType tipoNaturezaJuridica;

    /**
     * Obtém o valor da propriedade codigoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNaturezaJuridica() {
        return codigoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade codigoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNaturezaJuridica(String value) {
        this.codigoNaturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade descricaoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoNaturezaJuridica() {
        return descricaoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade descricaoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoNaturezaJuridica(String value) {
        this.descricaoNaturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade codigoNaturezaJuridicaConcla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNaturezaJuridicaConcla() {
        return codigoNaturezaJuridicaConcla;
    }

    /**
     * Define o valor da propriedade codigoNaturezaJuridicaConcla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNaturezaJuridicaConcla(String value) {
        this.codigoNaturezaJuridicaConcla = value;
    }

    /**
     * Obtém o valor da propriedade tipoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link TipoNaturezaJuridicaType }
     *     
     */
    public TipoNaturezaJuridicaType getTipoNaturezaJuridica() {
        return tipoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade tipoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNaturezaJuridicaType }
     *     
     */
    public void setTipoNaturezaJuridica(TipoNaturezaJuridicaType value) {
        this.tipoNaturezaJuridica = value;
    }

}
