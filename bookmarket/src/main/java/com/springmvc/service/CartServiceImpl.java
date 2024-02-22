package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Cart;
import com.springmvc.exception.CartException;
import com.springmvc.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart create(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.create(cart);
	}

	@Override
	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return cartRepository.read(cartId);
	}

	@Override  //update메서드에서 cartRepository의 update 메서드로 이동
	public void update(String cartId, Cart cart) {
		cartRepository.update(cartId, cart);
		
	}

	@Override
	public void delete(String cartId) {
		cartRepository.delete(cartId);
		
	}

	@Override
	public Cart validateCart(String cartId) {
		Cart cart = cartRepository.read(cartId);
		if(cart == null || cart.getCartItems().size() == 0) {
			throw new CartException(cartId);
		}
		return cart;
	}
	
	
}
