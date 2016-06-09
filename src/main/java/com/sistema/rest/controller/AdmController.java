package com.sistema.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.rest.model.Message;
import com.sistema.rest.model.Adm;
import com.sistema.rest.repository.AdmRepository;

/**
 * 
 * @author Karil
 *
 */
@RestController
@RequestMapping("/api/adms")
public class AdmController {
	@Autowired AdmRepository admRepository;

	/**
	 * @return Retorna todas as notícias
	 */
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Adm> findAll() {
		return admRepository.findAll();
	}
	
	/**
	 * @return Retorna uma adm por id
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Adm show(@PathVariable Long id) {
		return admRepository.findOne(id);
	}
	
	/**
	 * Insere uma notícia na base de dados
	 */
	@RequestMapping(value="", method=RequestMethod.POST)
	public Adm save(@RequestBody Adm adm) {
		admRepository.save(adm);
		return adm;
	}		
	
	/**
	 * Remove uma notícia na base de dados
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public Message delete(@PathVariable Long id) {
		admRepository.delete(id);
		return Message.OK;
	}	
	
}
