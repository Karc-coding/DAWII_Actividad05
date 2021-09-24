package com.consul.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consul.app.entity.Ciclo;
import com.consul.app.repository.CicloRepository;
import com.consul.app.service.CicloService;

@Service
public class CicloServiceImpl implements CicloService {

	@Autowired
	private CicloRepository repo;

	@Override
	public List<Ciclo> listCiclo() {
		return repo.findAll();
	}
	
}
