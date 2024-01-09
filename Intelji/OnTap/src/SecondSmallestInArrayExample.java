import java.util.*;
public class SecondSmallestInArrayExample {
    int[]a;
    int total;
    public SecondSmallestInArrayExample(int[]a, int total){
        this.a = a;
        this.total = total;
    }
    public int SecondSmallestInArrayExample(int[]a, int total) {
        int temp;
        for (int i = 0;i <total; i++){
            for (int j = i+1; j<total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }
        return a[1];
    }
}
