package com.zensar.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.OrderMessageRequest;
import com.zensar.entity.FulfillmentOrderEntity;
import com.zensar.exception.InvalidOrderIdException;
import com.zensar.repo.OrderMessageRepo;

@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	OrderMessageRepo orderMessageRepo;

	@Override
	public boolean updateOderStatus(int id, OrderMessageRequest oreMessageRequest) {
		// TODO Auto-generated method stub
		Optional<FulfillmentOrderEntity> optOrder = this.orderMessageRepo.findById(id);
		if (optOrder.isPresent()) {
			
			FulfillmentOrderEntity existingOrder = optOrder.get();
			existingOrder.setOrderStatus(oreMessageRequest.getOrderStatus());
			
			this.orderMessageRepo.save(existingOrder);
			return true;
		}
		throw new InvalidOrderIdException();
		
	}



}
