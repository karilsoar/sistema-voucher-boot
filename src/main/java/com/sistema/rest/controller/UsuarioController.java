package com.sistema.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.rest.model.Message;
import com.sistema.rest.model.Usuario;
import com.sistema.rest.repository.UsuarioRepository;

/**
 * 
 * @author Karil
 *
 */
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	@Autowired UsuarioRepository usuarioRepository;

	/**
	 * @return Retorna todas as notícias
	 */
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	/**
	 * @return Retorna uma usuario por id
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Usuario show(@PathVariable Long id) {
		return usuarioRepository.findOne(id);
	}
	
	/**
	 * Insere uma notícia na base de dados
	 */
	@RequestMapping(value="", method=RequestMethod.POST)
	public Usuario save(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
		return usuario;
	}		
	
	/**
	 * Remove uma notícia na base de dados
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public Message delete(@PathVariable Long id) {
		usuarioRepository.delete(id);
		return Message.OK;
	}	
	
}
