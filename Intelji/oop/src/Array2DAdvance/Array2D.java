package Array2DAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array2D {
   private int dong;
   private int cot;
   private int arr[][];

    public Array2D(int dong, int cot) {
        this.dong = dong;
        this.cot = cot;
        this.arr = new int[dong][cot];
        RandomArray2D();
    }

    public Array2D(){
        this.arr = new int[dong][cot];

    }

    private void RandomArray2D(){
        Random random = new Random();
        for (int i= 0; i<arr.length; i++){
            for (int j= 0; j<arr[i].length; j++){
                arr[i][j] = random.nextInt(9)+1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // a. Cho biết dòng nào có tổng các phần tử lớn nhất và bằng bao nhiêu
    public void TongLonNhatDong(){

        int MaxsumTong=-100;
        int []maxSum=arr[0];
        for (int i =0; i<arr.length; i++){// duyệt qua từng dòng
            int sum_cua_dong_dang_xet = 0;
            for (int j =0; j<arr[i].length; j++){ // duyệt qua từng cột
                sum_cua_dong_dang_xet+=arr[i][j];

            }
            if (sum_cua_dong_dang_xet>MaxsumTong){
                MaxsumTong = sum_cua_dong_dang_xet;
                maxSum = arr[i];

            }
        }
        System.out.println("Dong co tong lon nhat la: ");
        for (int i=0; i<maxSum.length; i++){
            System.out.print(maxSum[i] + " ");
        }

    }

    // b. Cho biết cột nào có tổng các phần tử là lớn nhất
    public void TongLonNhatCot(){
        //int[] maxSum= arr[0];
        List<Integer> maxSum = new ArrayList<>();// lưu trữ cột ngon nhất
        int sumCot = 0;
        for (int i= 0; i<cot; i++){
            int sum_dang_xet = 0;
            for (int j= 0; j<dong; j++){ // dòng lặp thực hien nhieu lan
                sum_dang_xet+= arr[j][i];
            }
            if (sum_dang_xet > sumCot){
                sumCot = sum_dang_xet;
                maxSum.clear(); // xoa de cap nhat cot moi
                for(int i1=0;i1<dong;i1++){
                    maxSum.add(arr[i1][i]);
                }
            }
        }
    }

    public void MaxTongChinhPhu(){
        if(dong!=cot){
            System.out.println("Phải là ma trận vuông");
            return;
        }
        // Tính tổng đường chéo chính
        int[] duong_cheo_chinh = new int[dong];// lưu thông tin đường chéo chính
        int[] duong_cheo_phu = new int[dong];// lưu thông tin đường chéo phụ
        int tong_chinh= 0;
        for (int i =0; i< arr.length; i++){
            tong_chinh+=arr[i][i];
            duong_cheo_chinh[i]= arr[i][i];
        }
        // Tổng đường chéo phụ
        int tong_phu = 0;
        for (int i= arr.length-1; i>=0; i--){
            int vt_cot = (arr.length-1)-i;
            tong_phu+= arr[i][vt_cot];
            duong_cheo_phu[i] = arr[i][vt_cot];
        }
        System.out.println("\nĐuong chéo có tổng lớn nhất là:");
        for (int i=0; i< arr.length; i++){
            if(tong_chinh>tong_phu){
                System.out.print(duong_cheo_chinh[i] + " ");
            }
            else {
                System.out.print( duong_cheo_phu[i] + " ");
            }
        }
    }
    private void SapXep1Chieu(int array1D[]){
        int temp;
        for (int i = 0; i< array1D.length; i++){
            for (int j = i+1; j< array1D.length; j++){
                if(array1D[i]>array1D[j]){
                    temp = array1D[i] ;
                    array1D[i] = array1D[j];
                    array1D[j] = temp;
                }
            }
        }
        // aray[i]=5, aray[j]=3
        // temp=0;

        //aray[i]=0
        //aray[i] = aray[j]=3
        //aray[j]=0


    }

    //d. Sắp xếp mảng các dòng tăng dần
    public void SapXep2chieu(){
        System.out.println("\nMảng được sắp xếp theo dòng:");
        for (int i=0; i<arr.length; i++){
            SapXep1Chieu(arr[i]);
            for (int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void RiengBiet(){
        System.out.println("\nPhần tử riêng biệt là:");
        List<Integer> phan_tu_rieng_biet = new ArrayList<>();
        for (int i= 0; i<arr.length; i++){
            for (int j= 0; j<arr[i].length; j++){
                int phan_tu_hien_tai = arr[i][j];
                if (!phan_tu_rieng_biet.contains(phan_tu_hien_tai)){
                    phan_tu_rieng_biet.add(arr[i][j]);
                }
            }
            System.out.println(phan_tu_rieng_biet + " ");
        }
    }

    public void cheo_chinh(){
        List<Integer> duongcheo = new ArrayList<>();
        System.out.println("\nĐường chéo chính là:");
        for (int i=0; i< arr.length;i++){
            duongcheo.add(arr[i][i]);
        }
        System.out.print(duongcheo+ " ");
    }

    public void cheo_phu(){
        System.out.println("\nĐường chéo phụ là:");
        List<Integer> duongcheo = new ArrayList<>();
        for (int i=arr.length-1; i>=0; i--){
            int cot_hien_tai = (arr.length-1) - i;
            duongcheo.add(arr[i][cot_hien_tai]);
        }
        System.out.println(duongcheo + " ");
    }
    public void Tong2MT(int[][]b){
        System.out.println("\nTổng 2 ma trận là: ");
        int[][]c = new int [b.length][b[0].length];
        if (arr.length!= b.length || arr[0].length != b[0].length){
            System.out.println("Mảng a với tương đồng với mảng b");
            return;
        }
        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                c[i][j]= b[i][j]+arr[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public int getDong() {
        return dong;
    }

    public void setDong(int dong) {
        this.dong = dong;
    }

    public int getCot() {
        return cot;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

}
