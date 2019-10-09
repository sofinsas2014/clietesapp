package com.mievaluacion.backend.cliente.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mievaluacion.backend.cliente.models.dao.ClienteDao;
import com.mievaluacion.backend.cliente.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		 
		clienteDao.deleteById(id);
	}

}
