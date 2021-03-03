package com.starksystem.ecommerce.payment.service;
import com.starksystem.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.starksystem.ecommerce.payment.Entity.PaymentEntity;


import java.util.Optional;
public interface PaymentService {
    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
