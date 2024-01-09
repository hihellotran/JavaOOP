package Abstract;

public class Cash extends Payment {
    @Override
    public void paymentTotal() {
        System.out.println("Pay by cash");
    }
}
