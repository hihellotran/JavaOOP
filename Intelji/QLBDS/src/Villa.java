public class Villa extends RealEstate implements BusinessFee{
    public Villa(String ID, double length, double width) {
        super(ID, length, width);
    }

    @Override
    public double calculateValue() {
        return getLength() * getWidth() * 400000; // Tính giá trị, diện tích = Length * Width
    }

    @Override
    public double calculateBusinessFee() {
        return getLength()* getWidth() * 1000; // Phí kinh doanh cho biệt thự, diện tích = Length * Width
    }
}