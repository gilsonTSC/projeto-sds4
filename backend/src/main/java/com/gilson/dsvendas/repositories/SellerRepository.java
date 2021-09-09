package com.gilson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilson.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}