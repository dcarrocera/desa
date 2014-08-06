package com.components.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace="http://ws.components.com/")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface GestRestEndpoint {

	@WebMethod
	@RequestWrapper(className="com.components.ws.WebMethodTest", localName="webMethodTest" , partName="webMethodTest" , targetNamespace="http://ws.components.com/")
	@ResponseWrapper(className="com.components.ws.WebMethodTestResponse")
	com.components.ws.impl.User webMethodTest(String param1, String param2, String param3, String param4);
	

}
