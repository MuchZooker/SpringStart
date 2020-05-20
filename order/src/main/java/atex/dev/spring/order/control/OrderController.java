package atex.dev.spring.order.control;

import atex.dev.spring.order.fegin.ProductFeginService;
import atex.dev.spring.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;
 @Autowired
 ProductFeginService productFeginService;

    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public String orderInfo(){
//        orderService.selectOrders();
        return "测试接口成功"+productFeginService.queryProductsInfo();
    }
}
