package com.tona.springboot.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tona.springboot.app.models.entity.Cliente;

public interface IClienteDao  extends JpaRepository<Cliente, Long>{
	
}
