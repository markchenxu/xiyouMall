package com.xiyou.mall.service;

import com.github.pagehelper.PageInfo;
import com.xiyou.mall.model.request.CreateOrderReq;
import com.xiyou.mall.model.vo.OrderVO;

/**
 * 描述：     订单Service
 */
public interface OrderService {


    String create(CreateOrderReq createOrderReq);

    OrderVO detail(String orderNo);

    PageInfo listForCustomer(Integer pageNum, Integer pageSize);

    void cancel(String orderNo);

    String qrcode(String orderNo);

    void pay(String orderNo);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    void deliver(String orderNo);

    void finish(String orderNo);
}
