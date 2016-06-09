package com.sistema.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.rest.model.Noticia;

/**
 * 
 * @author robson
 *
 */
@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long>{
	
}
