
class CardPayment extends Payment { //Payments.java and extends Payment (using open closed principle here because we have various types of payments lish cash,card,upi)
    float total_price,total_discount;
    @Override
    public boolean doPayment() {
        
         System.out.println("payment done using Card");
         return true;
    }

}