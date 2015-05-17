package hello;

import org.springframework.stereotype.Component;

@Component("impl1")
public class MessagePrinterImpl1 implements MessageService {

	@Override
	public String getMessage() {
		return "impl 1";
	}

}