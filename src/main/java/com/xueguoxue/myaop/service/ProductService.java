package com.xueguoxue.myaop.service;

import com.xueguoxue.myaop.domain.Product2;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

//    @Autowired
//    AuthService authService;


//    @AdminOnly
    public void insert(Product2 product){
//        authService.checkAccess();
        System.out.println("insert product.");
    }

    public void findById(Long id){
        System.out.println("execute find by id");
    }

//    @AdminOnly
    public void delete(Long id){
//        authService.checkAccess();
        System.out.println("delete product");
    }
}
