package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Associate;

@Repository
public interface AssociateJpaRepository  extends JpaRepository<Associate, Integer>, AssociateRepository {

}
