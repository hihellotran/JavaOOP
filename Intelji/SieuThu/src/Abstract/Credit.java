package Abstract;

public class Credit extends Payment {

    @Override
    public void paymentTotal() {
        System.out.println("Pay by credit card");
    }
}
