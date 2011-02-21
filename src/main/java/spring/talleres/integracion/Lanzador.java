package spring.talleres.integracion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanzador {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("proceso.xml",Lanzador.class);
	}
}
