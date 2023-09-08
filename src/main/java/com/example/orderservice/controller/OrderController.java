package com.example.orderservice.controller;

import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
@Log4j2
public class OrderController {

    private OrderService orderService;

    @PostMapping("/register/order")
    public ResponseEntity<Long> addOrder(@RequestBody OrderRequest orderRequest){
        long orderId = orderService.placeOrder(orderRequest);
        log.info("Oder Id: {}", orderId);
        return new ResponseEntity<>(orderId, HttpStatus.CREATED);
    }
}
