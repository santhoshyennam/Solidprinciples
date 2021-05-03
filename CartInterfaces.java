import java.util.*;

//Interface Seggregation Principle
interface ModifyList 
{
    
    boolean isEmpty();
    boolean deleteProduct();
    boolean deleteProduct(int item_id);
}



interface MyList extends ModifyList
{
    List<ItemDetails> showProducts();
    int getTotalItems();
}


