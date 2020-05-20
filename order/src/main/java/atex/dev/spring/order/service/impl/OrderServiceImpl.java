package atex.dev.spring.order.service.impl;

import atex.dev.spring.order.dao.OrderInfoDao;
import atex.dev.spring.order.dto.OrderDetailInfo;
import atex.dev.spring.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderInfoDao orderInfoDao;
    @Override
    public List<OrderDetailInfo> selectOrders() {
        return orderInfoDao.queryOrders();
    }
}
