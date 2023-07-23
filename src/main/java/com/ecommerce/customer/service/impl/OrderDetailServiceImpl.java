package com.ecommerce.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.customer.dto.OrderDetailDto;
import com.ecommerce.customer.model.OrderDetail;
import com.ecommerce.customer.repository.OrderDetailRepository;
import com.ecommerce.customer.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	/* Admin */
	@Autowired
	private OrderDetailRepository orderDetailRepository;

	@Override
	public List<OrderDetail> getOrderDetailInOrder(Long orderId) {
		return orderDetailRepository.getOrderDetailInOrder(orderId);
	}

	@Override
	public List<OrderDetailDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
