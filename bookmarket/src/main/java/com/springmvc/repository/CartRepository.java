package com.springmvc.repository;

import com.springmvc.domain.Cart;

public interface CartRepository {
	Cart create(Cart cart);
	Cart read(String cartId);
	
	//update를 처리할 updateCarte() 메서드 선언
	void update(String cartId, Cart cart);
	
	void delete(String cartId);
}
