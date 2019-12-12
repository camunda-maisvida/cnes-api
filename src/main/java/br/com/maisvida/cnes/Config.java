package br.com.maisvida.cnes;

import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import br.com.maisvida.cnes.client.SOAPConnector;

@Configuration
public class Config {
	 @Bean
	    public Jaxb2Marshaller marshaller() {
	        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	        marshaller.setContextPath("br.com.maisvida.cnes.wsdl");
	        return marshaller;
	    }
	 
	    @Bean
	    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
	        SOAPConnector client = new SOAPConnector();
	        client.setInterceptors(new ClientInterceptor[]{ securityInterceptor() });
	        client.setDefaultUri("https://servicoshm.saude.gov.br/cnes/EstabelecimentoSaudeService/v1r0");	        
	        client.setMarshaller(marshaller);
	        client.setUnmarshaller(marshaller);
	        return client;
	    }
	    
	    @Bean
	    public Wss4jSecurityInterceptor securityInterceptor() {
	      Wss4jSecurityInterceptor security = new Wss4jSecurityInterceptor();
	      
	      security.setSecurementActions(WSHandlerConstants.TIMESTAMP +" "+ WSHandlerConstants.USERNAME_TOKEN);
	      
	      // Set values for "UsernameToken" sections in SOAP header
	      security.setSecurementPasswordType(WSConstants.PW_TEXT);
	      security.setSecurementUsername("CNES.PUBLICO");
	      security.setSecurementPassword("cnes#2015public");
	      return security;
	    }
}
