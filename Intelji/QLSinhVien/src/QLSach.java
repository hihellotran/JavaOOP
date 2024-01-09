import java.util.ArrayList;
import java.util.List;

public class QLSach {
    List<TaiLieu> taiLieuList;
    public QLSach(){
        taiLieuList = new ArrayList<TaiLieu>();
    }
    public void ThemSach(TaiLieu tl){

            taiLieuList.add(tl);


    }
    public void TimKiem(String ma){
        for (TaiLieu tl : taiLieuList){
            if(tl.matl.equals(ma)){
                System.out.println(tl.toString());
            }
        }
    }

    public void HienThi(){
        for (TaiLieu tl : taiLieuList){
            System.out.println(tl.toString());
        }
    }
    public void Xoa(String ma){
        List<TaiLieu> phan_tu_xoa = new ArrayList<>();
        for (TaiLieu tl : taiLieuList){
            if (tl.matl.equals(ma)){
                phan_tu_xoa.add(tl);
            }
        }
        taiLieuList.removeAll(phan_tu_xoa);
    }
}
