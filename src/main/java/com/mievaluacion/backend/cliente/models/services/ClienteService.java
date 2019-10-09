package com.mievaluacion.backend.cliente.models.services;
import java.util.List;

import com.mievaluacion.backend.cliente.models.entity.Cliente;


public interface ClienteService {
  
	 public List <Cliente> findAll();
	 
	 public Cliente findById(Long id);
	 
	 public Cliente save(Cliente cliente);
	 
	 public void delete(Long id);
	 
	 
}
