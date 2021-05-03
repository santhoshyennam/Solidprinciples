
class UpiPayment extends Payment {  //Payments.java
    float total_price,total_discount;
    @Override
    public boolean doPayment() {
        
         System.out.println("payment done using Card");
         return true;
    }

}