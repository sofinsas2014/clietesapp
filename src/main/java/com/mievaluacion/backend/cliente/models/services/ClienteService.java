package com.mievaluacion.backend.cliente.models.services;
import java.util.List;

import com.mievaluacion.backend.cliente.models.entity.Cliente;


public interface ClienteService {
  
	 public List <Cliente> findAll();
}
