import java.util.*;

public class Cart implements MyList { //MyList from CartInterfaces.java
    

    int totalItems;
	Float total_price,total_discount;
    List<ItemDetails> items_in_cart; // from ItemDetails.java
    UserSession usersession; //UserSession.java    and creating interface reference(Dependency Inversion principle)
                            //  High modules will not depend on low modules,there will an abstraction

    Cart(UserSession session)
    {
        usersession = session;

        //fetch from Database
        totalItems=5;
        total_price=1500.55f;
        total_discount=234.56f;
    }


	
	public boolean deleteProduct(int itemid)
	{
		//delete item from database user uid where item_id = itemid;
        System.out.println("item is deleted");
		return true;
	}
	public boolean deleteProduct()
	{
		//delete all items from cart;
        totalItems=0;
		return true;
	}
	public List<ItemDetails> showProducts()
	{
        //retrieve all items from cart using uid
		return items_in_cart;

	}
    @Override
    public boolean isEmpty() {
        if(totalItems==0)
        return true;

        return false;
    }
    public int getTotalItems()
    {
        return totalItems;
    }

}
