import java.util.Random;

public class Main {

    public static void SapXep(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int dong = 3;
        int cot = 5;
        int[][] array = new int[dong][cot];
        Random random = new Random();
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                array[i][j] = random.nextInt(100)+10;
            }
        }
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        // In ra giá trị bằng 10 và vị trí của nó

        for (int i = 0; i<dong; i++){
            for (int j = 0; j < cot; j++){
                if (array[i][j] == 10){
                    System.out.println("Giá trị băng 10 ở vị trí dòng =" + i  + " cột=" + j);

                }
            }
        }

        //Tìm phần tu lớn nhất và cho biết vị trí nó là ở đâu
//        int vtri_dong = 0;
//        int vtri_cot = 0;
//        int max = array[0][0];
//        for (int i = 0; i<dong; i++){
//            for (int j = 0; j<cot; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                    vtri_dong = i;
//                    vtri_cot = j;
//                }
//            }
//        }
//        System.out.println("Phần tử lớn nhất là:" + max + " ở vị trí dòng:" + vtri_dong + " ở cột:" + vtri_cot);

        // Kiếm phần tử lớn nhất ở từng dòng
//        int[] phantulonnhatcuamoidong = new int[dong];
//
//        for (int i = 0; i<dong; i++){
//            int max_dong = array[i][0];
//            for (int j = 0; j<cot; j++){
//                if(array[i][j] > max_dong){
//                    max_dong = array[i][j];
//                }
//            }
//            phantulonnhatcuamoidong[i] = max_dong;
//        }
//        System.out.println("Phần tử lớn nhất ở mỗi dòng là :");
//        for (int i = 0; i < phantulonnhatcuamoidong.length; i++ ){
//            System.out.println("dòng thứ " +  i + ":" + phantulonnhatcuamoidong[i] );
//        }
        System.out.println("Mảng sau khi sắp xếp là:"  );
        for (int i=0; i<dong; i++){
            SapXep(array[i]);
        }
        for (int i = 0; i<dong; i++){
            for (int j = 0; j<cot;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        // In ra tất cả các giá trị là số chẵn
    }
}
