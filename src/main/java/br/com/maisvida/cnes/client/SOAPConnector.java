package br.com.maisvida.cnes.client;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

public class SOAPConnector extends WebServiceGatewaySupport {
	 
    public Object callWebService(String url, Object request){
        WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
		try {
			MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
			SaajSoapMessageFactory newSoapMessageFactory = new SaajSoapMessageFactory(msgFactory);
			webServiceTemplate.setMessageFactory(newSoapMessageFactory);
		} catch (SOAPException e) {
			e.printStackTrace();
		}
		return webServiceTemplate.marshalSendAndReceive(url, request);
    }
}