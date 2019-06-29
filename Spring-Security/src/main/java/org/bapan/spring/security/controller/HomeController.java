/**
 * 
 */
package org.bapan.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ruptam
 *
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}

}
