import java.util.Random;
public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(8, 12);
        PhanSo ps2 = new PhanSo(1, 3);


        PhanSo[] mang_ps = new PhanSo[10];
        Random r = new Random();
        for(int i=0; i< mang_ps.length; i++){
            int tu = r.nextInt(10);
            int mau = r.nextInt(15)+1;
            mang_ps[i] = new PhanSo(tu, mau);
            //System.out.println(mang_ps[i].toString());
        }

        PhanSo ps_lon_nhat = mang_ps[0];
        double gt_thap_phan_ps_dang_xet;
        double gt_thap_phan_ps_lon_nhat;
        for (int i =1; i< mang_ps.length; i++){
             gt_thap_phan_ps_dang_xet = mang_ps[i].tu/mang_ps[i].mau;
             gt_thap_phan_ps_lon_nhat = ps_lon_nhat.tu/ps_lon_nhat.mau;
            if(gt_thap_phan_ps_dang_xet>gt_thap_phan_ps_lon_nhat){
                ps_lon_nhat = mang_ps[i];
            }
        }
        System.out.println("Giá trị lớn nhất:"+ps_lon_nhat.toString());






//        System.out.println(ps1.Cong(ps2).toString());
//        ps1.RutGon();
//        System.out.println(ps1.toString());


    }
}
