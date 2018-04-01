package com.xueguoxue.myaop;

import com.xueguoxue.myaop.dao.ProductDao;
import com.xueguoxue.myaop.domain.Product;
import com.xueguoxue.myaop.log.LogService;
import com.xueguoxue.myaop.security.CurrentUserHolder;
import com.xueguoxue.myaop.service.DemoService;
import com.xueguoxue.myaop.service.MenuService;
import com.xueguoxue.myaop.service.ProductService;
import com.xueguoxue.myaop.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.parameters.P;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.Option;
import java.awt.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyaopApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
    SubService subService;

	@Autowired
    LogService logService;

	@Autowired
    DemoService demoService;

	@Autowired
    MenuService menuService;

	@Autowired
    ProductDao productDao;

	@Test(expected = Exception.class)
	public void annoInsertTest() {
		CurrentUserHolder.set("tom");
		productService.delete(1L);
	}

	@Test
    public void subServiceTest(){
	    subService.demo();
    }

    @Test
    public void logServiceTest(){
	    logService.log();
    }

    @Test
    public void findByIdTest(){
	    productService.findById(1L);
    }

	@Test
    public void adminInsert()
    {
        CurrentUserHolder.set("admin");
        productService.delete(1L);
    }

    @Test
    public void withNoTransactionTest()
    {
       demoService.addUser("tom");
    }

    @Test
    public void getMenuTest()
    {
        System.out.println("menu call:" + menuService.getMenuList());
        System.out.println("menu call:" + menuService.getMenuList());
    }

    @Test
    public void testInsert() {
        Product product = new Product();
        product.setName("dell computer");
        product.setOnlineTime(new Date());
        product.setBuyPrice(new BigDecimal("29.5"));
        product.setCategory("computer");
        product.setDetail("this is a dell notebook");
        product.setUpdateTime(new Date());
        productDao.save(product);
        System.out.println("new product id:"+product.getId());
    }

    @Test
    public void testUpdate(){
//        Product product = productDao.findOne(1L);
        Optional<Product> optionalProduct = productDao.findById(9L);
        Product product = optionalProduct.get();
        product.setName("test-update");
        product.setBuyPrice(new BigDecimal("23.5"));
        product.setOnlineTime(new Date());
        productDao.save(product);
    }

    @Test
    public void testDelete(){
//        productDao.delete(1L);
    }

}
