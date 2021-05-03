
//single responsibility principle
public class OrderCancellation  implements OrderCancellationInterface // from OrderInterfaces.java file
{
    UserSession usersession;
    
    OrderCancellation(UserSession session)
    {
        //initialize usersession
        usersession=session;
    }

    public boolean cancelOrder(int orderid)
    {
        return true;
    }
}