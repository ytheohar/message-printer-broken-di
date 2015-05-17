package hello;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrinterController {

	private static final Logger log = Logger.getLogger(PrinterController.class.getName());

	@Resource
	private MessageService service;

	@RequestMapping("/")
	public void print() {
		log.info(service.getMessage());
	}
}