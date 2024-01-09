import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập mảng");
//        int n = 5;
//        int[] a = new int[n];
//        SecondSmallestInArrayExample s = new SecondSmallestInArrayExample(a,n);
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i<n; i++){
//            a[i] = sc.nextInt();
//        }
//       System.out.println(s.SecondSmallestInArrayExample(a, n));
       // int b[] = {44, 66, 99, 77, 33, 22, 55};
        int b[] = {1,3,9,8,6};
        SecondSmallestInArrayExample s = new SecondSmallestInArrayExample(b, b.length);
        System.out.println(s.SecondSmallestInArrayExample(b, b.length));
    }
}