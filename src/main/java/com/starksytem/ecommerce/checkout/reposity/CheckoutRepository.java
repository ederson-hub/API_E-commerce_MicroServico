package com.starksytem.ecommerce.checkout.reposity;

import com.starksytem.ecommerce.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
}
