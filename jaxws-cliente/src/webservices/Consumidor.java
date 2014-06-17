package webservices;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class Consumidor {

	public static void main(String[] args) {
		RandomService randomService = new RandomService();
		Random random = randomService.getRandomPort();

		BindingProvider bp = (BindingProvider) random;
		Map<String, List<String>> heards = new HashMap<>();
		heards.put("login", Collections.singletonList("thiago"));
		heards.put("senha", Collections.singletonList("123muda1"));
		bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, heards);

		double next = random.next(50);
		System.out.println(next);
	}
}
