package com.zensar.services;

import com.zensar.dto.OrderMessageRequest;

public interface OrderService {

	boolean updateOderStatus(int id,OrderMessageRequest oreMessageRequest);
	
}
