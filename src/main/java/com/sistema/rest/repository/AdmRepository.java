package com.sistema.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.rest.model.Adm;

/**
 * 
 * @author Karil
 *
 */
@Repository
public interface AdmRepository extends JpaRepository<Adm, Long>{
	
}
