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
 * Número do CEP.
 * 
 * <p>Classe Java de CEPType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CEPType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroCEP" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep}NumeroCEPType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CEPType", namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep", propOrder = {
    "numeroCEP"
})
public class CEPType {

    @XmlElement(required = true)
    protected String numeroCEP;

    /**
     * Obtém o valor da propriedade numeroCEP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCEP() {
        return numeroCEP;
    }

    /**
     * Define o valor da propriedade numeroCEP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCEP(String value) {
        this.numeroCEP = value;
    }

}
