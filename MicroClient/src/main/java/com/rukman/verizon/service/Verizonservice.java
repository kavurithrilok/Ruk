package com.rukman.verizon.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import cm.rukman.models.Verizongrocery;

@Service
public class Verizonservice 
{

public List<Verizongrocery> verizongrocery = Arrays.asList(
			
		new Verizongrocery(123456789,"Ruku"),
		new Verizongrocery(123456788,"Rukman"),
		new Verizongrocery(123456888,"Raj"),
		new Verizongrocery(123458888,"Nirmal"),
		new Verizongrocery(123488888,"Vidhya")
			) ;
	
	public Verizonservice() {}
	
	public Verizongrocery getVerizongroceryById(int Verizongroceryid) {
		return this.verizongrocery.stream().filter(x -> x.getVerizongroceryid() == Verizongroceryid).findFirst().get();
	}
	
	public List<Verizongrocery> getallshoppinglists(){
		return this.verizongrocery;
	}
	
}
