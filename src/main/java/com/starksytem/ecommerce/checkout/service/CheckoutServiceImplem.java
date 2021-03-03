package com.starksytem.ecommerce.checkout.service;


import com.starksytem.ecommerce.checkout.entity.CheckoutEntity;
import com.starksytem.ecommerce.checkout.reposity.CheckoutRepository;
import com.starksytem.ecommerce.checkout.resource.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImplem implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create (CheckoutRequest checkoutRequest){
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }

}
