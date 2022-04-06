package solutions.mundovirtual.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import solutions.mundovirtual.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
