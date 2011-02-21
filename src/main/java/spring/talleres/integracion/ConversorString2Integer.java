package spring.talleres.integracion;

import org.springframework.core.convert.converter.Converter;

public class ConversorString2Integer implements Converter<String,Integer>{

	@Override
	public Integer convert(String cad) {
		return Integer.parseInt(cad);
	}

}
