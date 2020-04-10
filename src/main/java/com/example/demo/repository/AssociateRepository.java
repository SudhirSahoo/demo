package com.example.demo.repository;

import com.example.demo.model.Associate;

public interface AssociateRepository {
	
	public Associate findByFirstName(String firstName);
	
}
