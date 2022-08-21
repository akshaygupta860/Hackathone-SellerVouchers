package com.hackathon.RewardManagement.Service;

import com.hackathon.RewardManagement.Entity.CouponEntity;
import com.hackathon.RewardManagement.Repository.CouponRepository;
import com.hackathon.RewardManagement.mapper.CouponMapper;
import com.hackathon.RewardManagement.model.Coupons;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CouponService {

    private final CouponRepository couponRepository;
    private final CouponMapper couponMapper;
    public Coupons getCoupons(String emailId){
        List<CouponEntity> couponEntity = couponRepository.findByEmailId(emailId);
        return new Coupons(couponMapper.map(couponEntity));
    }
}
