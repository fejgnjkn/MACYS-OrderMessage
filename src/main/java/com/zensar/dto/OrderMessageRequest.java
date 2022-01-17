package com.zensar.dto;

public class OrderMessageRequest {
	
	private String orderStatus;
	
	
	public OrderMessageRequest() {
		super();
	}	
	
	public OrderMessageRequest(String orderStatus) {
		super();
		this.orderStatus = orderStatus;
	}


	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	@Override
	public String toString() {
		return "OrderMessageRequest [ orderStatus=" + orderStatus + "]";
	}
	
	

}
