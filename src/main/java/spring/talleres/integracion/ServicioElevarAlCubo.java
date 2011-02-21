package spring.talleres.integracion;

import org.springframework.integration.annotation.ServiceActivator;

public class ServicioElevarAlCubo{
	@ServiceActivator
	public Integer calcular(Integer numero){
		Integer res=numero*numero*numero;
		System.out.println("--->el cubo de "+numero+" es "+res);
		return res;
	}

}
