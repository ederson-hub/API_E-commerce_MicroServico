package com.starksystem.ecommerce.payment.repository;
import com.starksystem.ecommerce.payment.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <PaymentEntity, Long>{
}
