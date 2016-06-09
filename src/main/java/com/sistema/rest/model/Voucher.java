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
public class Voucher {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int valor;
	
	@Column(name="descx")
	private String desc;
	
	public Voucher() {
	}
	public Voucher(String titulo, String texto, int valor) {
		this.nome = nome;
		this.desc = desc;
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
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
