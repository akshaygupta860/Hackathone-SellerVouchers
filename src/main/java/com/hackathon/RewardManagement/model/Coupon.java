package com.hackathon.RewardManagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Coupon
{
    private String code;

    private String title;

    private String couponType;

    private Boolean isUsed;

    private Boolean isExpired;

    private String couponDescription;

    private String emailId;

    private ZonedDateTime expirationDate;

    private String termsConditions;
}
