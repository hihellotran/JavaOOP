package Array2DAdvance;

public class Main {
    public static void main(String[] args){
        Array2D array2D = new Array2D(3,3);
        array2D.TongLonNhatDong();
        array2D.TongLonNhatCot();
        array2D.MaxTongChinhPhu();
        array2D.SapXep2chieu();
        array2D.RiengBiet();
        array2D.cheo_chinh();
        array2D.cheo_phu();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        array2D.Tong2MT(matrix);
    }
}
