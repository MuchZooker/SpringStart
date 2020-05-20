package atex.dev.spring.order.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PRODUCT")
public interface ProductFeginService {

    @GetMapping("products")
    String queryProductsInfo();
}
