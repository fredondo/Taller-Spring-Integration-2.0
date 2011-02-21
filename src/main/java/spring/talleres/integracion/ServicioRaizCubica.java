package spring.talleres.integracion;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.message.GenericMessage;
import org.springframework.integration.support.MessageBuilder;

public class ServicioRaizCubica{
	@ServiceActivator
	public GenericMessage<Integer> calcular(GenericMessage<Integer> mensaje){
		Integer numero=mensaje.getPayload();
		Integer res=(int) Math.cbrt(numero);
		System.out.println("--->la raiz cubica de "+numero+" es "+res);
		return (GenericMessage<Integer>) MessageBuilder.withPayload(res).build();
	}

}
