package atex.dev.spring.order.service;

import atex.dev.spring.order.dto.OrderDetailInfo;

import java.util.List;

public interface OrderService {

    List<OrderDetailInfo> selectOrders();
}
