package com.gilson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilson.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}