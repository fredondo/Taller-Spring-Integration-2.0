package spring.talleres.integracion;

import org.springframework.integration.Message;
import org.springframework.integration.core.MessageSelector;

public class FiltroMensajes implements MessageSelector {

	@Override
	public boolean accept(Message<?> msg) {
		return msg.getPayload().toString().length()>1;
	}

}
