public class Sach extends TaiLieu{
    String ten_tac_gia;
    int so_trang;
    public Sach(String matl, String nxb, int sobanphathanh, String ten_tac_gia
    , int so_trang) {
        super(matl, nxb, sobanphathanh);
        this.ten_tac_gia = ten_tac_gia;
        this.so_trang = so_trang;
    }

    @Override
    public String toString() {
        return super.toString()+ "Sach{" +
                "ten_tac_gia='" + ten_tac_gia + '\'' +
                ", so_trang=" + so_trang +
                '}';
    }
}
