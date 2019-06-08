package com.routinecart.component.seller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rc_seller")
@Data
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = true)
	private String mobile;
	
	@Column(nullable = false)
	private String name;

}
