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
public class Adm {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String senha;
	private	String email;
	private boolean ativo;
	
	
	public Adm() {
	}
	public Adm(String titulo, String senha, String email, boolean ativo) {
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.ativo = ativo;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
