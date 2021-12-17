package com.enscatalog.ensapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enscatalog.ensapp.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
