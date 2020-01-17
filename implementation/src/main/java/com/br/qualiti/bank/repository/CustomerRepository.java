package com.br.qualiti.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.qualiti.bank.model.Customer;


	@Repository
	public interface CustomerRepository extends JpaRepository<Customer, Long>{
		List<Customer> findByNameContaining(String name);
	}

