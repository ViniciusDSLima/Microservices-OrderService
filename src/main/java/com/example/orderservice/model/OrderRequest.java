package com.example.orderservice.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {

    private Long productId;
    private Long totalAmount;
    private int quantity;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}
