package com.zensar.actuator;

import org.springframework.stereotype.Component;

import com.zensar.repo.OrderMessageRepo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

@Component
@Endpoint(id = "order-stat")
public class OrderCountActuator {

	@Autowired
	OrderMessageRepo orderMessageRepo;
	
	private Map<String, Long> map = new HashMap<>();

	@PostConstruct
	public void initialize() {
		long messageCount = this.orderMessageRepo.count();
		map.put("no-of-orders", messageCount);
	}

	@ReadOperation
	public Map<String, Long> getOderCount() {
		return map;
	}

}
