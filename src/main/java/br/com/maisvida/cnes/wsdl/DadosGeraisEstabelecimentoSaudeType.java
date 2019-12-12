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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosGeraisEstabelecimentoSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosGeraisEstabelecimentoSaudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes}CodigoCNES" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigounidade}CodigoUnidade" minOccurs="0"/&gt;
 *         &lt;element name="nomeFantasia" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico}NomeJuridicoType" minOccurs="0"/&gt;
 *         &lt;element name="nomeEmpresarial" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico}NomeJuridicoType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj}CNPJ" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco}Endereco" minOccurs="0"/&gt;
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/diretor}Diretor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade}tipoUnidade" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/esferaadministrativa}esferaAdministrativa" minOccurs="0"/&gt;
 *         &lt;element name="MunicipioGestor" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType" minOccurs="0"/&gt;
 *         &lt;element name="Telefone" type="{http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone}TelefoneType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/email}EmailType" minOccurs="0"/&gt;
 *         &lt;element name="Localizacao" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/localizacao}localizacaoType" minOccurs="0"/&gt;
 *         &lt;element name="perteceSistemaSUS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="servicoespecializados" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/servicoespecializados}ServicoEspecializadosType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosGeraisEstabelecimentoSaudeType", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes", propOrder = {
    "codigoCNES",
    "codigoUnidade",
    "nomeFantasia",
    "nomeEmpresarial",
    "cnpj",
    "endereco",
    "dataAtualizacao",
    "diretor",
    "tipoUnidade",
    "esferaAdministrativa",
    "municipioGestor",
    "telefone",
    "email",
    "localizacao",
    "perteceSistemaSUS",
    "servicoespecializados"
})
public class DadosGeraisEstabelecimentoSaudeType {

    @XmlElement(name = "CodigoCNES", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes")
    protected CodigoCNESType codigoCNES;
    @XmlElement(name = "CodigoUnidade", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigounidade")
    protected CodigoUnidadeType codigoUnidade;
    protected NomeJuridicoType nomeFantasia;
    protected NomeJuridicoType nomeEmpresarial;
    @XmlElement(name = "CNPJ", namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj")
    protected CNPJType cnpj;
    @XmlElement(name = "Endereco", namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco")
    protected EnderecoType endereco;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAtualizacao;
    @XmlElement(name = "Diretor", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/diretor")
    protected DiretorType diretor;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade")
    protected TipoUnidadeType tipoUnidade;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/esferaadministrativa")
    protected EsferaAdministrativaType esferaAdministrativa;
    @XmlElement(name = "MunicipioGestor")
    protected MunicipioType municipioGestor;
    @XmlElement(name = "Telefone")
    protected List<TelefoneType> telefone;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "Localizacao")
    protected LocalizacaoType localizacao;
    protected Boolean perteceSistemaSUS;
    protected ServicoEspecializadosType servicoespecializados;

    /**
     * Obtém o valor da propriedade codigoCNES.
     * 
     * @return
     *     possible object is
     *     {@link CodigoCNESType }
     *     
     */
    public CodigoCNESType getCodigoCNES() {
        return codigoCNES;
    }

    /**
     * Define o valor da propriedade codigoCNES.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoCNESType }
     *     
     */
    public void setCodigoCNES(CodigoCNESType value) {
        this.codigoCNES = value;
    }

    /**
     * Obtém o valor da propriedade codigoUnidade.
     * 
     * @return
     *     possible object is
     *     {@link CodigoUnidadeType }
     *     
     */
    public CodigoUnidadeType getCodigoUnidade() {
        return codigoUnidade;
    }

    /**
     * Define o valor da propriedade codigoUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoUnidadeType }
     *     
     */
    public void setCodigoUnidade(CodigoUnidadeType value) {
        this.codigoUnidade = value;
    }

    /**
     * Obtém o valor da propriedade nomeFantasia.
     * 
     * @return
     *     possible object is
     *     {@link NomeJuridicoType }
     *     
     */
    public NomeJuridicoType getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Define o valor da propriedade nomeFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeJuridicoType }
     *     
     */
    public void setNomeFantasia(NomeJuridicoType value) {
        this.nomeFantasia = value;
    }

    /**
     * Obtém o valor da propriedade nomeEmpresarial.
     * 
     * @return
     *     possible object is
     *     {@link NomeJuridicoType }
     *     
     */
    public NomeJuridicoType getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    /**
     * Define o valor da propriedade nomeEmpresarial.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeJuridicoType }
     *     
     */
    public void setNomeEmpresarial(NomeJuridicoType value) {
        this.nomeEmpresarial = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link CNPJType }
     *     
     */
    public CNPJType getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link CNPJType }
     *     
     */
    public void setCNPJ(CNPJType value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoType }
     *     
     */
    public EnderecoType getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoType }
     *     
     */
    public void setEndereco(EnderecoType value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacao(XMLGregorianCalendar value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade diretor.
     * 
     * @return
     *     possible object is
     *     {@link DiretorType }
     *     
     */
    public DiretorType getDiretor() {
        return diretor;
    }

    /**
     * Define o valor da propriedade diretor.
     * 
     * @param value
     *     allowed object is
     *     {@link DiretorType }
     *     
     */
    public void setDiretor(DiretorType value) {
        this.diretor = value;
    }

    /**
     * Obtém o valor da propriedade tipoUnidade.
     * 
     * @return
     *     possible object is
     *     {@link TipoUnidadeType }
     *     
     */
    public TipoUnidadeType getTipoUnidade() {
        return tipoUnidade;
    }

    /**
     * Define o valor da propriedade tipoUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUnidadeType }
     *     
     */
    public void setTipoUnidade(TipoUnidadeType value) {
        this.tipoUnidade = value;
    }

    /**
     * Obtém o valor da propriedade esferaAdministrativa.
     * 
     * @return
     *     possible object is
     *     {@link EsferaAdministrativaType }
     *     
     */
    public EsferaAdministrativaType getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    /**
     * Define o valor da propriedade esferaAdministrativa.
     * 
     * @param value
     *     allowed object is
     *     {@link EsferaAdministrativaType }
     *     
     */
    public void setEsferaAdministrativa(EsferaAdministrativaType value) {
        this.esferaAdministrativa = value;
    }

    /**
     * Obtém o valor da propriedade municipioGestor.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioType }
     *     
     */
    public MunicipioType getMunicipioGestor() {
        return municipioGestor;
    }

    /**
     * Define o valor da propriedade municipioGestor.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioType }
     *     
     */
    public void setMunicipioGestor(MunicipioType value) {
        this.municipioGestor = value;
    }

    /**
     * Gets the value of the telefone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelefoneType }
     * 
     * 
     */
    public List<TelefoneType> getTelefone() {
        if (telefone == null) {
            telefone = new ArrayList<TelefoneType>();
        }
        return this.telefone;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade localizacao.
     * 
     * @return
     *     possible object is
     *     {@link LocalizacaoType }
     *     
     */
    public LocalizacaoType getLocalizacao() {
        return localizacao;
    }

    /**
     * Define o valor da propriedade localizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizacaoType }
     *     
     */
    public void setLocalizacao(LocalizacaoType value) {
        this.localizacao = value;
    }

    /**
     * Obtém o valor da propriedade perteceSistemaSUS.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerteceSistemaSUS() {
        return perteceSistemaSUS;
    }

    /**
     * Define o valor da propriedade perteceSistemaSUS.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerteceSistemaSUS(Boolean value) {
        this.perteceSistemaSUS = value;
    }

    /**
     * Obtém o valor da propriedade servicoespecializados.
     * 
     * @return
     *     possible object is
     *     {@link ServicoEspecializadosType }
     *     
     */
    public ServicoEspecializadosType getServicoespecializados() {
        return servicoespecializados;
    }

    /**
     * Define o valor da propriedade servicoespecializados.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicoEspecializadosType }
     *     
     */
    public void setServicoespecializados(ServicoEspecializadosType value) {
        this.servicoespecializados = value;
    }

}
