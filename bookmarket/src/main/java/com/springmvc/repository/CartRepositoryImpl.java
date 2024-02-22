package com.springmvc.repository;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.springmvc.domain.Cart;

@Repository
public class CartRepositoryImpl implements CartRepository{

	private Map<String, Cart> listOfCarts;

	public CartRepositoryImpl() {
		listOfCarts = new HashMap<String, Cart>();
	}
	
	@Override
	public Cart create(Cart cart) {
		if(listOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(String.format("장바구니를 생성할 수 없습니다. 장바구니 id(%)가 존재합니다.", cart.getCartId()));
		}
		listOfCarts.put(cart.getCartId(), cart);
		return cart;
	}

	@Override
	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return listOfCarts.get(cartId);
	}

	@Override  //CartServiceImpl에서 호출함
	public void update(String cartId, Cart cart) {
		System.out.println("updateRepository");
		System.out.println("update의 cartId:"+cartId);
		System.out.println("update의 cart:"+cart);
		if(!listOfCarts.keySet().contains(cartId)) {
			//장바구니 ID가 존재하지 않은 경우 예외 처리
			throw new IllegalArgumentException(String.format("장바구니 목록을 갱신할 수 없습니다. 장바구니 id(%)가 존재하지 않습니다", cartId));
		}
		System.out.println("장바구니 담음");
		listOfCarts.put(cartId, cart);
		
	}

	@Override
	public void delete(String cartId) {
		if (!listOfCarts.keySet().contains(cartId)) {
			//장바구니 ID가 존재하지 않으면 예외 처리
			throw new IllegalArgumentException(String.format("장바구니 목록을 삭제할 수 없습니다. 장바구니 id(%)가 존재하지 않습니다", cartId));
		}
		listOfCarts.remove(cartId);
	}
	
	
	

}
