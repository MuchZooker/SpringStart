package atex.dev.spring.product.service.impl;

import atex.dev.spring.product.dao.ProductInfoDao;
import atex.dev.spring.product.dto.ProductInfoDto;
import atex.dev.spring.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by atex on 2020/5/15.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductInfoDao productInfoDao;


    @Override
    public List<ProductInfoDto> selectProductInfo() {
        return productInfoDao.queryAllProducts();
    }

    @Override
    public void deleteProduct(String productId,int number) {
         productInfoDao.deleteProduct(productId,number);
    }
}
