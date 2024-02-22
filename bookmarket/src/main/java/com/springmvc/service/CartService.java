package com.springmvc.service;

import com.springmvc.domain.Cart;

public interface CartService {
	Cart create(Cart cart);
	Cart read(String cartId);
	
	//update를 위한 update() 메서드 선언
	void update(String cartId, Cart cart);
	
	void delete(String cartId);
	
	//15.1.3 추가 장바구니 예외 처리를 위한 메서드 추가
	Cart validateCart(String cartId);
}
