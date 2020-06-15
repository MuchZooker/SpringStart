package atex.dev.spring.product.service;

import atex.dev.spring.product.dto.ProductInfoDto;

import java.util.List;

/**
 * Created by atex on 2020/5/15.
 */
public interface ProductService {


    List<ProductInfoDto> selectProductInfo();
   void deleteProduct(String productId,int number);
}
