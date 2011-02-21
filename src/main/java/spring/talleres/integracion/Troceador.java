package spring.talleres.integracion;

import java.util.Arrays;
import java.util.List;

import org.springframework.integration.annotation.Splitter;

public class Troceador {
	@Splitter 
	public List<String>partir(String cad){
		return Arrays.asList(cad.split(","));
	}
}
