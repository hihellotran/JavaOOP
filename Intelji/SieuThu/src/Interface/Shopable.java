package Interface;
import Class.*;
public interface Shopable {
    public abstract void insertBill(Purchase purchase, Product product);
    public abstract void deleteBill(Purchase purchase, Product product);
    public abstract Double total(Purchase purchase);

    public  abstract void insertBill(Purchase purchase, String productName);
}
