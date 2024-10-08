package com.Crudoperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Crudoperation.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
