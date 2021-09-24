package com.consul.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consul.app.entity.Disponibilidad;
import com.consul.app.service.DisponibilidadService;
import com.consul.app.util.Constantes;

@RestController
@RequestMapping("/rest/disponibilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class DisponibilidadController {

	@Autowired
	public DisponibilidadService disponibilidadService;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Disponibilidad>> listDisponibilidad(){
		List<Disponibilidad> list = disponibilidadService.listDisponibilidad();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertDisponibilidad(@RequestBody Disponibilidad obj){
		Map<String, Object> dispo = new HashMap<>();
		try {
			Disponibilidad objDispo = disponibilidadService.insertDisponibilidad(obj);
			if (objDispo == null) {
				dispo.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				dispo.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			dispo.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(dispo);
	}
	
}
