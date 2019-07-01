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
public class LoginController {
	
	@GetMapping("/showMyLoginPage")
	public String showLoginForm() {
		return "plain-login";
	}
}
