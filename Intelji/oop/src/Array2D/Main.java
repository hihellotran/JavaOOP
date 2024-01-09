package Array2D;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(7,7);
        matrix.printMatrix();
        System.out.println("Tổng ma trận là: " + matrix.sumMatrix());
        System.out.println("Phần tử lớn nhat: " + matrix.maxMatrix());
        System.out.println("Phần tử nhỏ nhat: " + matrix.minMatrix());
        matrix.demSo3ChuSo();
        matrix.demSNT();
        System.out.println("Số chẵn đường chéo chính là: " +  matrix.demChan());
        System.out.println("Số lẽ trên đường chéo phụ là: " + matrix.demLe());
    }
}