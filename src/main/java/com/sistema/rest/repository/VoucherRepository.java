package com.sistema.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.rest.model.Voucher;

/**
 * 
 * @author Karil
 *
 */
@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Long>{
	
}
