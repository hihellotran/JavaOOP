public class TapChi extends TaiLieu {
    int so_phat_hanh;
    int thang_phat_hanh;

    public TapChi(String matl, String nxb, int sobanphathanh, int so_phat_hanh,
                  int thang_phat_hanh) {
        super(matl, nxb, sobanphathanh);
        this.so_phat_hanh = so_phat_hanh;
        this.thang_phat_hanh = thang_phat_hanh;
    }

    @Override
    public String toString() {
        return super.toString() + "TapChi{" +
                "so_phat_hanh=" + so_phat_hanh +
                ", thang_phat_hanh=" + thang_phat_hanh +
                '}';
    }
}
