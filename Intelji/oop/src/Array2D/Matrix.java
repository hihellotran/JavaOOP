package Array2D;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int dong;
    private int cot;
    private int[][] matran;

    public Matrix(int dong, int cot) {
        this.dong = dong;
        this.cot = cot;
        this.matran = new int[dong][cot];
        initializedMatrix();
    }

    public Matrix() {
        matran = new int[this.dong][this.cot];
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

    public int[][] getMatran() {
        return matran;
    }

    public void setMatran(int[][] matran) {
        this.matran = matran;
    }

    private void initializedMatrix() {
        Random random = new Random();
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                matran[i][j] = random.nextInt(1000) + 1;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                System.out.print(matran[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int sumMatrix() {
        int sum = 0;
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                sum += matran[i][j];
            }
        }
        return sum;
    }

    public int maxMatrix() {
        int max = matran[0][0];
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                if (matran[i][j] > max) {
                    max = matran[i][j];
                }
            }
        }
        return max;
    }

    public int minMatrix() {
        int min = matran[0][0];
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                if (matran[i][j] < min) {
                    min = matran[i][j];
                }
            }
        }
        return min;
    }


    //đếm xem có bao nhiêu số có 3 chữ số ở mỗi dòng
    public void demSo3ChuSo() {
        int count=0;
        for (int i = 0; i < matran.length; i++) {
            count = 0;
            for (int j = 0; j < matran[i].length; j++) {
                if (matran[i][j] > 99 && matran[i][j] < 1000){
                    count++;
                }
            }
            System.out.println("Số lượng phần tử có 3 chữ số của dòng thứ " + (i+1) + " là " + count);
        }
    }

    private int checkSNT(int n){ // 10 2 ->
        if(n==2 || n==3){
            return 1;
        }
        for (int i = 2; i <= n/2; i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public void demSNT(){
        int count=30042002;
        //cot=5 dong=10
        //50 phan tu matran[i][j]
        // matran[cot][dong] = matran[5][10]
        for (int i = 0; i < cot; i++) {
            count = 0;
            for (int j = 0; j < dong; j++) {
                int soCanKiemTra= matran[j][i];
                if (checkSNT(soCanKiemTra)==1){
                    count++;
                }
            }
            System.out.println("Số nguyên tố ở mỗi cột " + (i+1) +" là: "  + count);
        }

    }

    public int demChan(){
        int count = 0;
        if(dong!=cot){
            System.out.println("Phải là ma trận vuông");
            return 0;
        }
        for (int i = 0; i<matran.length; i++){
            if (matran[i][i]%2==0){
                count++;
            }
        }
        return count;
    }

    public int demLe(){
        int count = 0;
        for (int i = matran.length -1; i>0; i--){
            int vi_tri_cuoi_cung_cua_mang = matran.length-1;
            int vitriCot = vi_tri_cuoi_cung_cua_mang - i;
            if(matran[i][vitriCot]%2!=0){
                count++;
            }// anh iu em nhieu lam, xin loi nhieu nhen!!! tai sao, tai sao gi ?
            //tai sao xin loi
            // làm em buồn
            //thương em nhiều lắm á
            //uhm kệ đi
            //đi đi không trễ
            // nếu sau này em chán r nhớ nói nha anh iu em
            // k chán đâu yên tâm
            //ok ạ bye 7h30
            //bye ta
            //<3
            //tắt máy nha
            //ok em iu
        }
        return count;
    }

    @Override
    public String toString() {
        return "Array2D.Matrix{" +
                "dong=" + dong +
                ", cot=" + cot +
                ", matran=" + Arrays.toString(matran) +
                '}';
    }
}
