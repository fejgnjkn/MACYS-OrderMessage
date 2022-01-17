package com.zensar.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.zensar.dto.OrderMessageRequest;
import com.zensar.services.OrderService;

import ch.qos.logback.core.status.Status;


@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	final void testUpdateOrder() throws Exception {
		String updateStatus = "{\"orderStatus\":\"open\"}";
		mockMvc.perform(MockMvcRequestBuilders.put("/7").contentType(MediaType.APPLICATION_JSON)
				.content(updateStatus).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
	}
	
	@Test
	final void testUpdateOrder_2() throws Exception {
		String updateStatus = "{\"orderStatus\":\"open\"}";
		mockMvc.perform(MockMvcRequestBuilders.put("/0").contentType(MediaType.APPLICATION_JSON)
				.content(updateStatus).accept(MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest()).andReturn();
	}
}
