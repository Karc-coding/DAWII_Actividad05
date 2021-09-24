package com.consul.app.service;

import java.util.List;

import com.consul.app.entity.Disponibilidad;

public interface DisponibilidadService {

	public Disponibilidad insertDisponibilidad(Disponibilidad disponibilidad);
	public List<Disponibilidad> listDisponibilidad();
	
}
