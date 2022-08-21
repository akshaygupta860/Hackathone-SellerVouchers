package com.hackathon.RewardManagement.mapper;

import com.hackathon.RewardManagement.Entity.CouponEntity;
import com.hackathon.RewardManagement.model.Coupon;
import com.hackathon.RewardManagement.model.Coupon.CouponBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-21T16:05:21+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.15.1 (Oracle Corporation)"
)
@Component
public class CouponMapperImpl implements CouponMapper {

    @Override
    public List<Coupon> map(List<CouponEntity> couponEntities) {
        if ( couponEntities == null ) {
            return null;
        }

        List<Coupon> list = new ArrayList<Coupon>( couponEntities.size() );
        for ( CouponEntity couponEntity : couponEntities ) {
            list.add( couponEntityToCoupon( couponEntity ) );
        }

        return list;
    }

    protected Coupon couponEntityToCoupon(CouponEntity couponEntity) {
        if ( couponEntity == null ) {
            return null;
        }

        CouponBuilder coupon = Coupon.builder();

        coupon.code( couponEntity.getCode() );
        coupon.title( couponEntity.getTitle() );
        coupon.couponType( couponEntity.getCouponType() );
        coupon.isUsed( couponEntity.getIsUsed() );
        coupon.isExpired( couponEntity.getIsExpired() );
        coupon.couponDescription( couponEntity.getCouponDescription() );
        coupon.emailId( couponEntity.getEmailId() );
        coupon.expirationDate( couponEntity.getExpirationDate() );
        coupon.termsConditions( couponEntity.getTermsConditions() );

        return coupon.build();
    }
}
