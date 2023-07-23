package com.ecommerce.customer.service;

import java.util.List;

import com.ecommerce.customer.dto.OrderDetailDto;
import com.ecommerce.customer.model.OrderDetail;

public interface OrderDetailService {

	/* Admin */
	List<OrderDetailDto> findAll();

	List<OrderDetail> getOrderDetailInOrder(Long orderId);

}
