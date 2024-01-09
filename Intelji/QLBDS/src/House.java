public class House extends RealEstate {
    private int floors;

    public House(String ID, double length, double width, int floors) {
        super(ID, length, width);
        this.floors = floors;
    }

    @Override
    public double calculateValue() {
        return getLength() * getWidth() * 10000 + floors * 100000; // Tính giá trị, diện tích = Length * Width
    }
}