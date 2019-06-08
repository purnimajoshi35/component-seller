package com.routinecart.component.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.routinecart.component.seller.entity.Seller;
import com.routinecart.component.seller.springdatajpa.BookRepository;

@RestController
@RequestMapping("/rest/v1/sellers")
public class SellerController {
	
	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/")
	public void doSomething() {
		bookRepository.save());
	}
}
