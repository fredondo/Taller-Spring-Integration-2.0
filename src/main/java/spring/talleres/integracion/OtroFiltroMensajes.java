package spring.talleres.integracion;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Filter;
import org.springframework.integration.core.MessageSelector;

public class OtroFiltroMensajes  {

	@Filter
	public boolean esValido(Message<?> msg) {
		return msg.getPayload().toString().length()>1;
	}

}
