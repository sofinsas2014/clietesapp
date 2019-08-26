package com.mievaluacion.backend.cliente.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.mievaluacion.backend.cliente.models.entity.Cliente;

public interface ClienteDao extends CrudRepository <Cliente, Long> {
	
	

}
