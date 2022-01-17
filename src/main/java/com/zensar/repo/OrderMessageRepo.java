package com.zensar.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.FulfillmentOrderEntity;

public interface OrderMessageRepo extends JpaRepository<FulfillmentOrderEntity, Integer> {

	List<FulfillmentOrderEntity> findByOrderID(int orderId);
}
