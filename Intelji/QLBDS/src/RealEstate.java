abstract class RealEstate {
    private String ID;
    private double length;
    private double width;

    public RealEstate(String ID, double length, double width) {
        this.ID = ID;
        this.length = length;
        this.width = width;
    }

    public String getID() {
        return ID;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Phương thức trừu tượng tính giá trị
    public abstract double calculateValue();



}