public class Hotel extends RealEstate implements BusinessFee{
    private int stars;

    public Hotel(String ID, double length, double width, int stars) {
        super(ID, length, width);
        this.stars = stars;
    }

    @Override
    public double calculateValue() {
        return 100000 + stars * 50000; // Tính giá trị
    }

    @Override
    public double calculateBusinessFee() {
        return getWidth() * 5000; // Phí kinh doanh cho khách sạn
    }
}