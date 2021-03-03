package com.starksytem.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Builder
@Data
@Entity
@RequiredArgsConstructor

public class CheckoutEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column
    @Enumerated(value = EnumType.STRING)
    private String code;

    enum Status{
        CREATED,
        APPROVED
    }
}
