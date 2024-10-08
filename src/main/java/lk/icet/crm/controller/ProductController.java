package lk.icet.crm.controller;
import lk.icet.crm.dto.Product;
import lk.icet.crm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductController {
       private final ProductService service;


       @PostMapping("/save-product")
       public Product saveproduct( @RequestBody Product product){
             service.saveproduct(product);


           return product;
       }
}
