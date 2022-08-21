package com.hackathon.RewardManagement.mapper;

import com.hackathon.RewardManagement.Entity.CouponEntity;
import com.hackathon.RewardManagement.model.Coupon;
import com.hackathon.RewardManagement.model.Coupons;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CouponMapper {

    CouponMapper COUPON_MAPPER = Mappers.getMapper(CouponMapper.class);
    List<Coupon> map(List<CouponEntity> couponEntities);
}
