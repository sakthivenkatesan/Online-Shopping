package OnlineShoppingApp;

import java.util.List;

public class Order 
{
	List<Cart> cartList;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
}
