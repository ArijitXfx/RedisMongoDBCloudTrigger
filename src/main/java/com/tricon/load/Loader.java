package com.tricon.load;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tricon.bean.ElasticOrder;
import com.tricon.repository.ElasticRepository;
import com.tricon.repository.OrderRepository;

@Component
public class Loader {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ElasticRepository elasticRepository;
	
	@PostConstruct
	public void loadData() {
		orderRepository.findAll().forEach(order->{
			elasticRepository.save(new ElasticOrder(order.getId(),order.getCustId(), order.getProductIds()));
		});
	}
}
