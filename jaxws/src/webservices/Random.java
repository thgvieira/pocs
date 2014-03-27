package webservices;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class Random {

	@Resource
	WebServiceContext wsc;
	
	@SuppressWarnings("rawtypes")
	public double next(double max) {
		
		MessageContext messageContext = wsc.getMessageContext();
		
		
		Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
		
		List loginList  = (List) headers.get("login");
		List senhaList = (List) headers.get("senha");
		
		String login = loginList != null ? loginList.get(0).toString() : null;
		String senha = senhaList != null ? senhaList.get(0).toString() : null;
		
		if("thiago".equals(login) && "123mudar".equals(senha)){
			return Math.random() * max;
		} else{
			throw new RuntimeException("Usuário ou senha incorreto.");
		}
		
	}
}
