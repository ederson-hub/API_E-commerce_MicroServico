package com.starksytem.ecommerce.checkout.service;

import com.starksytem.ecommerce.checkout.entity.CheckoutEntity;
import com.starksytem.ecommerce.checkout.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
