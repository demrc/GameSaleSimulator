package Concrete;

import Abstract.DiscountService;
import Entity.Discount;

public class DiscountManager implements DiscountService{

	@Override
	public void add(Discount discount) {
		System.out.println("Games are on sale="+" "+discount.getDiscountRate());
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println("Updated games are on sale="+" "+discount.getDiscountRate());
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println("Discounts are over.");
		
	}

}
