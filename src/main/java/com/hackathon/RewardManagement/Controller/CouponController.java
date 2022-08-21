package com.hackathon.RewardManagement.Controller;

import com.hackathon.RewardManagement.Service.CouponService;
import com.hackathon.RewardManagement.model.Coupons;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
@Slf4j
public class CouponController {
    private final CouponService couponService;

    @GetMapping("/getCoupons/{userId}")
    public Coupons getCoupons(@PathVariable String userId){
         return couponService.getCoupons(userId);
    }
}
