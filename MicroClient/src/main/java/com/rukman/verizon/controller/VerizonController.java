package com.rukman.verizon.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rukman.verizon.service.Verizonservice;

import cm.rukman.models.Verizongrocery;

@RestController
public class VerizonController {
	
	@Autowired
	private Verizonservice service;
	
public List<Verizongrocery> verizongrocery = Arrays.asList(
			
			new Verizongrocery(123456789,"Ruku"),
			new Verizongrocery(123456788,"Rukman"),
			new Verizongrocery(123456888,"Raj"),
			new Verizongrocery(123458888,"Nirmal"),
			new Verizongrocery(123488888,"Vidhya")
			) ;


@RequestMapping("/Ssn/{Verizongroceryid}")
public Verizongrocery getVerizongrocery (@PathVariable int Verizongroceryid ) {
	return service.getVerizongroceryById(Verizongroceryid);
	}


	
	@RequestMapping("/Ssn")
	public List<Verizongrocery> getverizonlist() {
		return service.getallshoppinglists();
		}
	
	
	@RequestMapping("/")
	public String hello() {
		return"Hello Verizon";
	}

}
