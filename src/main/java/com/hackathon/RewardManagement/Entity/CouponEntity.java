package com.hackathon.RewardManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "coupon")
@Builder
@AllArgsConstructor
public class CouponEntity {

    @Id
    private String code;

    private String title;

    private String couponType;

    private Boolean isUsed;

    private Boolean isExpired;

    private String couponDescription;

    private String emailId;

    @Column(name = "expiration_date", updatable = false)
    private ZonedDateTime expirationDate;

    private String termsConditions;

}
