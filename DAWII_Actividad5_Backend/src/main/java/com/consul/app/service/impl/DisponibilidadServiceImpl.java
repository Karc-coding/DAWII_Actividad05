package com.consul.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consul.app.entity.Disponibilidad;
import com.consul.app.repository.DisponibilidadRepository;
import com.consul.app.service.DisponibilidadService;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

	@Autowired
	private DisponibilidadRepository repo;

	@Override
	public Disponibilidad insertDisponibilidad(Disponibilidad disponibilidad) {
		return repo.save(disponibilidad);
	}

	@Override
	public List<Disponibilidad> listDisponibilidad() {
		return repo.findAll();
	}
	
}
