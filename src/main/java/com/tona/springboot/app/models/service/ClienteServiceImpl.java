package com.tona.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tona.springboot.app.dao.IClienteDao;
import com.tona.springboot.app.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
		
	}
	@Transactional(readOnly = true)
	@Override
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return clienteDao.findAll(pageable);
	}
	
	
	
}
