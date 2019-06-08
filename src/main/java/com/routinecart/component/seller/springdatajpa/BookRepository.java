package com.routinecart.component.seller.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import com.routinecart.component.seller.entity.Seller;


public interface BookRepository extends CrudRepository<Seller, Long> {

}
