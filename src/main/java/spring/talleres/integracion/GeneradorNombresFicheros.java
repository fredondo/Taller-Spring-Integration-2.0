package spring.talleres.integracion;

import org.springframework.integration.Message;
import org.springframework.integration.file.FileNameGenerator;

public class GeneradorNombresFicheros implements FileNameGenerator {

	@Override
	public String generateFileName(Message<?> msg) {
		return msg.getHeaders().getId()+".txt";
	}

}
