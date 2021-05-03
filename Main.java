public class Main {
    public static void main(String[] args) {
        Authentication userlogin = new User();
        if(userlogin.login("santhosh","123456"))
        {
           
            UserSession session = new User();
            System.out.println("user id is "+session.getUid());
            System.out.println("login status is "+session.getLoginStatus());
            
            UserProfileInterface profile = new UserProfile(session);
            profile.updateProfile();

            MyList cartList = new Cart(session);
            System.out.println("Total items in cart are "+ cartList.getTotalItems());
            
            
            PaymentRefractor paymentrefractor = new PaymentRefractor();
            Payment payment = paymentrefractor.create(1);
            payment.doPayment();

            ShowOrders orders = new OrderDetails(session);
            System.out.println("total pending orders are "+orders.totalPendingOrders());

            userlogin.logout();
            System.out.println("login status is "+session.getLoginStatus());

        }
        else
        {
            System.out.println("failed to login");
        }
    }
}
