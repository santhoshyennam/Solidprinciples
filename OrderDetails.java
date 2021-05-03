import java.util.ArrayList;
import java.util.*;

//single responsibilty as it fetches list of order details from database(single task)
 class OrderDetails implements ShowOrders{ // from OrderInterfaces.java file

    UserSession usersession;
    List<OrdersList> completed;
    List<OrdersList> pending;
    int CompletedOrders,PendingOrders;

    OrderDetails(UserSession session)
    {
        usersession = session;

        //initailize,fetch from database
        CompletedOrders=10;
        PendingOrders=2;
    }

    @Override
    public List<OrdersList> completedOrders() {
        //fetch from database
        
        return completed;
    }

    @Override
    public List<OrdersList> pendingOrders() { 
        return pending;
    }
    public int totalCompletedOrders()
    {
        return CompletedOrders;
    }
    public int totalPendingOrders()
    {
        return PendingOrders;
    }
    
}
