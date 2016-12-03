package kr.ac.hansung.hansol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // @Component + 컨트롤러 역활 까지 합한놈.
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//http://localhost:8080/helloSplingMVC
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {	
		return "home"; //view logical name
	}
	
}
