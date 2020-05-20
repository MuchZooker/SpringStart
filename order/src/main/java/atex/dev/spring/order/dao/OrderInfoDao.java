package atex.dev.spring.order.dao;


import atex.dev.spring.order.dto.OrderDetailInfo;

import java.util.List;

public interface OrderInfoDao {
    List<OrderDetailInfo> queryOrders();
}
