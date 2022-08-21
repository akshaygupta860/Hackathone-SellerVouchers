package com.hackathon.RewardManagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Coupons {
    List<Coupon> coupons;

    public Coupons() {
        this.coupons = new ArrayList<>();
    }
}
