package com.consul.app.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "disponibilidad")
public class Disponibilidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDisponibilidad;
	
	@Column(name = "horaInicio")
	private Time startTime;
	
	@Column(name = "horaFin")
	private Time endTime;
	
	@Column(name = "dia")
	private String day;
	
	@ManyToOne
	@JoinColumn(name = "idCiclo")
	private Ciclo idCycle;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario idUser;
	
}
