public class EmptyLand extends RealEstate {
    public EmptyLand(String ID, double length, double width) {
        super(ID, length, width);
    }
    @Override
    public double calculateValue() {
        return getLength() * getWidth() * 10000; // Tính giá trị, diện tích = Length * Width
    }
}
