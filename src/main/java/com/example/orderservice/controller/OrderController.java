package com.example.orderservice.controller;

import com.example.orderservice.service.OrderService;
import com.example.orderservice.vo.ResponseOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order-service")
public class OrderController {

    Environment environment;
    OrderService orderService;

    @GetMapping("/health_check")
    public ResponseEntity<ResponseOrder> createOrder() {

    }


}
