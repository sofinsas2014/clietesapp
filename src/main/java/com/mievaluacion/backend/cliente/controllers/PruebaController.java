package com.mievaluacion.backend.cliente.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@RequestMapping("/")
public class PruebaController {

	//@RequestMapping(value="/pdf",method=RequestMethod.GET)
	@GetMapping("/pdfview")
	public String Pdfview(Model model)
	{   System.out.print("caracoles");
		return "/pdfview";
		//return new ModelAndView("/resources/templates/pdfview.html");
	}
	
}
