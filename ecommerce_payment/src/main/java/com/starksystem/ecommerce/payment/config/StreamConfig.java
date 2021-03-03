package com.starksystem.ecommerce.payment.config;

import com.starksystem.ecommerce.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@EnableBinding(CheckoutProcessor.class)
@Configuration
public class StreamConfig {
}
