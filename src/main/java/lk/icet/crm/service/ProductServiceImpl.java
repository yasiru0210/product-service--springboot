package lk.icet.crm.service;

import lk.icet.crm.dto.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public int evaluProductrating(int noofLikes){
        if( noofLikes>90){
            return 5;
        }else if  ( noofLikes > 90) {
            return 5;
        } else if ( noofLikes > 70) {
            return 4;
        } else if ( noofLikes > 50) {
            return 3;
        } else if ( noofLikes > 20) {
            return 2;
        } else if (noofLikes>5) {
            return 1;
        }
        return 0;
    }



    @Override
    public Product saveproduct(Product product) {
        return null;
    }
}
