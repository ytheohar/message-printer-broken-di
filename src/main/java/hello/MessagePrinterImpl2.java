package hello;

import org.springframework.stereotype.Component;

@Component("impl2")
public class MessagePrinterImpl2 implements MessageService {

	@Override
	public String getMessage() {
		return "impl 2";
	}

}