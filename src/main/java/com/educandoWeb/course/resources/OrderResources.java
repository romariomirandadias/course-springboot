package com.educandoWeb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
