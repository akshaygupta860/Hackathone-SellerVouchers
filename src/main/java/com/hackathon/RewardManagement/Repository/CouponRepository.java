package com.hackathon.RewardManagement.Repository;

import com.hackathon.RewardManagement.Entity.CouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CouponRepository extends JpaRepository<CouponEntity, String> {
     List<CouponEntity> findByEmailId(String emailId);
 }
