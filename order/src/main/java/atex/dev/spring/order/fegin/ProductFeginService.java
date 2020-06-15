package atex.dev.spring.order.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PRODUCT")
public interface ProductFeginService {

    @GetMapping("/product/products")
    String queryProductsInfo();

    @GetMapping("/product/delete")
    String deleteProduct(@RequestParam("productId")String productId,@RequestParam("num")int num);
}
