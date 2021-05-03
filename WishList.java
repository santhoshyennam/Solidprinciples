import  java.util.*;

public class WishList implements WishListToCart //From WishListToCart.java
{

    int totalItems;
	Float total_price,total_discount;
    List<ItemDetails> items_in_wishlist;
    UserSession session;

    WishList(UserSession session)
    {
        this.session = session;
        totalItems=5;
        total_price=1500.55f;
        total_discount=234.56f;
        items_in_wishlist= new ArrayList<ItemDetails>();
    }
	@Override
	public void moveProduct(int item_id) {
        //moves one product
	}

	@Override
	public void moveProduct() {
			//move all products from wishlist to cart
	}

	@Override
	public boolean deleteProduct() {
        //delete all products from wishlist
		return true;
	}

	@Override
	public boolean deleteProduct(int i) {
        //delete particulart product
		return true;
	}
	@Override
	public List<ItemDetails> showProducts() {
		return items_in_wishlist;
	}

    @Override
    public boolean isEmpty() {
        return false;
    }

    public int getTotalItems()
    {
        return totalItems;
    }
}

