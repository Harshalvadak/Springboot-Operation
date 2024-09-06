package com.Crudoperation.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Crudoperation.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
