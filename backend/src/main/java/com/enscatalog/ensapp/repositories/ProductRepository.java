package com.enscatalog.ensapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enscatalog.ensapp.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
