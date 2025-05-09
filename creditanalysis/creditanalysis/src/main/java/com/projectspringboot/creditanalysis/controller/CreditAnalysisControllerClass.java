package com.projectspringboot.creditanalysis.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class CreditAnalysisControllerClass {
	
	
	@RequestMapping(value ="/home")
	public String home() {
		return "Checking the applictaion ";
	}
	
	
	

}
