package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

	@Bean(name = "service")
	public MessageService provider() {
		return new MessagePrinterImpl1();
	}

}