package com.xueguoxue.myaop.dao;

import com.xueguoxue.myaop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
//    public Product findById(Long id);

//    public void delete(Long id);
}
