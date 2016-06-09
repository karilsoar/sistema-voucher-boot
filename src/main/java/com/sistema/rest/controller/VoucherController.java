package com.sistema.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.rest.model.Message;
import com.sistema.rest.model.Voucher;
import com.sistema.rest.repository.VoucherRepository;

/**
 * 
 * @author Karil
 *
 */
@RestController
@RequestMapping("/api/vouchers")
public class VoucherController {
	@Autowired VoucherRepository voucherRepository;

	/**
	 * @return Retorna todas os voucherss
	 */
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Voucher> findAll() {
		return voucherRepository.findAll();
	}
	
	/**
	 * @return Retorna um voucher por id
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Voucher show(@PathVariable Long id) {
		return voucherRepository.findOne(id);
	}
	
	/**
	 * Insere um voucher na base de dados
	 */
	@RequestMapping(value="", method=RequestMethod.POST)
	public Voucher save(@RequestBody Voucher voucher) {
		voucherRepository.save(voucher);
		return voucher;
	}		
	
	/**
	 * Remove um voucher na base de dados
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public Message delete(@PathVariable Long id) {
		voucherRepository.delete(id);
		return Message.OK;
	}	
	
}
