//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.12.12 às 02:27:07 PM BRT 
//


package br.com.maisvida.cnes.wsdl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelefoneType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelefoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TipoTelefone" type="{http://servicos.saude.gov.br/schema/corporativo/telefone/v1r1/tipotelefone}TipoTelefoneType" minOccurs="0"/&gt;
 *         &lt;element name="DDI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *               &lt;maxInclusive value="999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DDD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *               &lt;maxInclusive value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numeroTelefone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *               &lt;maxInclusive value="999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelefoneType", namespace = "http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone", propOrder = {
    "identificador",
    "tipoTelefone",
    "ddi",
    "ddd",
    "numeroTelefone"
})
public class TelefoneType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(name = "TipoTelefone")
    protected TipoTelefoneType tipoTelefone;
    @XmlElement(name = "DDI")
    protected Integer ddi;
    @XmlElement(name = "DDD")
    protected Integer ddd;
    protected Integer numeroTelefone;

    /**
     * Obtém o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificador(BigInteger value) {
        this.identificador = value;
    }

    /**
     * Obtém o valor da propriedade tipoTelefone.
     * 
     * @return
     *     possible object is
     *     {@link TipoTelefoneType }
     *     
     */
    public TipoTelefoneType getTipoTelefone() {
        return tipoTelefone;
    }

    /**
     * Define o valor da propriedade tipoTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTelefoneType }
     *     
     */
    public void setTipoTelefone(TipoTelefoneType value) {
        this.tipoTelefone = value;
    }

    /**
     * Obtém o valor da propriedade ddi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDDI() {
        return ddi;
    }

    /**
     * Define o valor da propriedade ddi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDDI(Integer value) {
        this.ddi = value;
    }

    /**
     * Obtém o valor da propriedade ddd.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDDD() {
        return ddd;
    }

    /**
     * Define o valor da propriedade ddd.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDDD(Integer value) {
        this.ddd = value;
    }

    /**
     * Obtém o valor da propriedade numeroTelefone.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * Define o valor da propriedade numeroTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroTelefone(Integer value) {
        this.numeroTelefone = value;
    }

}
