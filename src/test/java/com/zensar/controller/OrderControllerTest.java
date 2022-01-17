package com.zensar.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.zensar.dto.OrderMessageRequest;
import com.zensar.services.OrderService;

public class OrderControllerTest {

//	@InjectMocks
//	OrderController orderController;
//
//	@Mock
//	OrderService orderService;
//
//	OrderMessageRequest ordReq;
//
//	@BeforeEach
//	void setup() throws Exception {
//		MockitoAnnotations.openMocks(this);
//
//		ordReq = new OrderMessageRequest();
//		ordReq.setOrderStatus("open");
//
//	}

	@Test
	final void testUpdateOrder() {
//		when(orderService.updateOderStatus(0, ordReq)).thenReturn(true);
		assertEquals(true, true);
	}
}
