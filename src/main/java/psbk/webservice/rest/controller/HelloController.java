package psbk.webservice.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@ResponseBody
	@RequestMapping (value="/hello",method = RequestMethod.GET)
	public String greeting(HttpServletRequest servletRequest){
		return "Hello my first love";
	}
	
	@ResponseBody
	@RequestMapping (value="/mhs",method = RequestMethod.GET)
	public String greetings(HttpServletRequest servletRequest){
		return "Hello my student";
	}
}
