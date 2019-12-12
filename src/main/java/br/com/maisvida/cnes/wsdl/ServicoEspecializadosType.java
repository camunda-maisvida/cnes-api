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
 * <p>Classe Java de ServicoEspecializadosType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicoEspecializadosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servicoespecializado" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/servicoespecializado}ServicoEspecializadoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicoEspecializadosType", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/servicoespecializados", propOrder = {
    "servicoespecializado"
})
public class ServicoEspecializadosType {

    @XmlElement(required = true)
    protected List<ServicoEspecializadoType> servicoespecializado;

    /**
     * Gets the value of the servicoespecializado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicoespecializado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicoespecializado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicoEspecializadoType }
     * 
     * 
     */
    public List<ServicoEspecializadoType> getServicoespecializado() {
        if (servicoespecializado == null) {
            servicoespecializado = new ArrayList<ServicoEspecializadoType>();
        }
        return this.servicoespecializado;
    }

}
