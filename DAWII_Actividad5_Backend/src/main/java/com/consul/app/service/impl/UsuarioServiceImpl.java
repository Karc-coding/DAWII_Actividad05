package com.consul.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consul.app.entity.Usuario;
import com.consul.app.repository.UsuarioRepository;
import com.consul.app.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;

	@Override
	public List<Usuario> listUsuario() {
		return repo.findAll();
	}
	
}
