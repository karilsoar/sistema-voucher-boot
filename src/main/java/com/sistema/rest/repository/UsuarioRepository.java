package com.sistema.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.rest.model.Usuario;

/**
 * 
 * @author Karil
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
