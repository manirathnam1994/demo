/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manirathnam
 *
 */
@RestController
public class DemoController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/init", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String helloWorld(@RequestBody String name) {
		String str = "Hello World";
		System.out.println("Result--> "+name);
		return str;
	}

}
