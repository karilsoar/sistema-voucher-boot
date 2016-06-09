package com.sistema.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sistema.rest.model.Voucher;
import com.sistema.rest.repository.VoucherRepository;

@SpringBootApplication
public class NoticiasBootstrapApplication {
	//Dados iniciais da base de dados
	//@Bean
	//CommandLineRunner runner(VoucherRepository voucherRepository){
		//return args -> {
//			noticiaRepository.save(new Noticia("Notícia 1", "Texto da Notícia 1"));
//			noticiaRepository.save(new Noticia("Notícia 2", "Texto da Notícia 2"));
//			noticiaRepository.save(new Noticia("Notícia 3", "Texto da Notícia 3"));
//			noticiaRepository.save(new Noticia("Notícia 4", "Texto da Notícia 4"));
			
			//voucherRepository.save(new Voucher("Nome 1", "desc 1",123));
		//};
	//}	
	
	public static void main(String[] args) {
		SpringApplication.run(NoticiasBootstrapApplication.class, args);
	}
}
