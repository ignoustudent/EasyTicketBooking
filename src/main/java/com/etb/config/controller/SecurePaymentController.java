/**
 * 
 */
package com.etb.config.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rakesh Singh
 *
 */

@Controller
@RequestMapping(value="secure/")
public class SecurePaymentController {

	
	private static final Logger log = LoggerFactory.getLogger(SecurePaymentController.class);

	
	@GetMapping("/payment")
	public String paymentPage() {
		
		log.info("################## SecurePaymentController: paymentPage Start #################");
		log.info("################## SecurePaymentController: paymentPage End #################");
		return "securepayment";
	}
}


