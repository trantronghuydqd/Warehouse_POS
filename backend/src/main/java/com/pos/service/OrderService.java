package com.pos.service;

import com.pos.dto.CouponPreviewResponseDTO;
import com.pos.dto.OrderRequestDTO;
import com.pos.dto.OrderResponseDTO;
import com.pos.dto.OrderItemDetailDTO;
import com.pos.entity.Order;

import java.math.BigDecimal;
import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    List<OrderItemDetailDTO> getOrderItems(Long orderId);
    CouponPreviewResponseDTO previewCoupon(String couponCode, BigDecimal grossAmount);
    OrderResponseDTO createOrder(OrderRequestDTO req);
}
