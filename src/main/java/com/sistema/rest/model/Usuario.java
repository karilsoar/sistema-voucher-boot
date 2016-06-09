package com.sistema.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Karil
 *
 */
@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
	@Column(name="descx")
	private String desc;
	
	public Usuario() {
	}
	public Usuario(String titulo, String texto) {
		this.nome = nome;
		this.desc = desc;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
