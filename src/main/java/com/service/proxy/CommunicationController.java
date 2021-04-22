package com.service.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/communication")
public class CommunicationController {
	
	@Autowired
	Configproperty configproperty;
	
	@Autowired
	private CummunicationService cummunicationService;
	
	@GetMapping("/getcommuication")
	public String saveData() {
		System.out.println("inside the communication");
		return cummunicationService.retrieveExchangeValue();
				
	}

	
	@GetMapping("/healthcheck")
	public String getstat() {
		System.out.println("inside the communication");
		return "health is ok"+configproperty.getValue();
				
	}
	
	@GetMapping("/demo-communicate")
	public String getstathealth() {
		System.out.println("inside the demo communication");
		return "demo communcation";
				
	}
}
