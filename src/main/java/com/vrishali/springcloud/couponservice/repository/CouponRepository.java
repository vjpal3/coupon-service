package com.vrishali.springcloud.couponservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrishali.springcloud.couponservice.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long>{

	Coupon findByCode(String code);

}
