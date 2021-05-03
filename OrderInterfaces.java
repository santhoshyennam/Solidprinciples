import java.util.*;

interface  ShowOrders
{
    List<OrdersList> completedOrders();
    List<OrdersList> pendingOrders();
    int totalCompletedOrders();
    int totalPendingOrders();
}

interface OrderCancellationInterface
{
    boolean cancelOrder(int itemid);
}