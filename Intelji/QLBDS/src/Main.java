public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng bất động sản
        EmptyLand emptyLand = new EmptyLand("001", 10, 20);
        House house = new House("002", 5, 15, 2);
        Hotel hotel = new Hotel("003", 15, 25, 4);
        Villa villa = new Villa("004", 30, 40);

        // Hiển thị thông tin và giá trị của từng đối tượng
        displayInfoAndValue(emptyLand);
        displayInfoAndValue(house);
        displayInfoAndValue(hotel);
        displayInfoAndValue(villa);

        // Nếu là biệt thự hoặc khách sạn, hiển thị thêm phí kinh doanh
        System.out.println("Business Fee for Villa: " + villa.calculateBusinessFee());

        System.out.println("Business Fee for Hotel: " + hotel.calculateBusinessFee());
    }

    private static void displayInfoAndValue(RealEstate realEstate) {
        System.out.println("ID: " + realEstate.getID());
        System.out.println("Length: " + realEstate.getLength());
        System.out.println("Width: " + realEstate.getWidth());
        System.out.println("Value: " + realEstate.calculateValue());
        System.out.println("\n");
    }
}
