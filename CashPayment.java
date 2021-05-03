public class CashPayment  extends Payment {  //Payment from Payments.java
    float total_price,total_discount;
    @Override
    public boolean doPayment() {
        System.out.println("payment done using cash");
        return true;
    }

}