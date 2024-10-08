package lk.icet.crm.service.impl;


import lk.icet.crm.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductService productService;


    @Test
    void test_evaluProductrating_when60Likes(){
        int rating = productService.evaluProductrating(60);

        Assertions.assertEquals(3,rating);
    }
    @Test
    void test_evaluProductrating_when20Likes(){
        int rating = productService.evaluProductrating(20);

        Assertions.assertEquals(1,rating);
    }

}
