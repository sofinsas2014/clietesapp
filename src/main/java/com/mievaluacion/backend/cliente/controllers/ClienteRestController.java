package com.mievaluacion.backend.cliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mievaluacion.backend.cliente.models.entity.Cliente;
import com.mievaluacion.backend.cliente.models.services.ClienteService;

@CrossOrigin(origins= {"http://localhost:4200","*"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
  
	@Autowired
     ClienteService clienteService;
	
	@GetMapping("/clientes")
	 public List <Cliente> index()
	 {
		 return clienteService.findAll();
	 }
	
}
