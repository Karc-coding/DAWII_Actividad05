package com.consul.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consul.app.entity.Ciclo;
import com.consul.app.entity.Usuario;
import com.consul.app.service.CicloService;
import com.consul.app.service.UsuarioService;

@RestController
@RequestMapping("/rest/util")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CicloService cicloService;
	
	@GetMapping("/usuario")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listUsuario(){
		List<Usuario> list = usuarioService.listUsuario();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/ciclo")
	@ResponseBody
	public ResponseEntity<List<Ciclo>> listCiclo(){
		List<Ciclo> list = cicloService.listCiclo();
		return ResponseEntity.ok(list);
	}
	
}
