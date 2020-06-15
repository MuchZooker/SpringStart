package atex.dev.spring.order.control;

import atex.dev.spring.order.dto.ProductDetailInfo;
import atex.dev.spring.order.fegin.ProductFeginService;
import atex.dev.spring.order.service.OrderService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;
 @Autowired
 ProductFeginService productFeginService;

    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public String orderInfo(){
        List<ProductDetailInfo> productDetailInfoList=new Gson().fromJson(productFeginService.queryProductsInfo(),new TypeToken<List<ProductDetailInfo>>(){}.getType());
        return "获取到商品数量"+productDetailInfoList.size();
    }


    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String addOrder(){

        return productFeginService.deleteProduct("10000001",1);
    }
}
