package atex.dev.spring.product.dao;

import atex.dev.spring.product.dto.ProductInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by atex on 2020/5/15.
 */
public interface ProductInfoDao {
    List<ProductInfoDto> queryAllProducts();

    void deleteProduct(@Param("productId")String productId,@Param("number") int number);
}
