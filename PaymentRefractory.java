import java.util.*;


//using one of the design pattern i.e Refractor pattern for loose coupling
class PaymentRefractor
{
    List<Payment> payment = new ArrayList<Payment>();  //Payment interface from Payments.java
    PaymentRefractor()
    {
        payment.add(new CashPayment());
        payment.add(new UpiPayment());
        payment.add(new CardPayment());
    }
    Payment create(int i)
    {
        return payment.get(i);
    }
}
