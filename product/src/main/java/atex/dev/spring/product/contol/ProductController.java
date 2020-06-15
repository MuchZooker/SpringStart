package atex.dev.spring.product.contol;

import atex.dev.spring.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by atex on 2020/5/15.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String queryProductsInfo() {

        return productService.selectProductInfo().toString();
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam(value = "productId") String productId,
                                int num) {
        productService.deleteProduct(productId,num);
        return "扣出订单库存完成";
    }

}
