package atex.dev.spring.product.dao;

import atex.dev.spring.product.dto.ProductInfoDto;

import java.util.List;

/**
 * Created by atex on 2020/5/15.
 */
public interface ProductInfoDao {
    List<ProductInfoDto> queryAllProducts();
}
