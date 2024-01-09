public class Bao extends TaiLieu{
    int ngay_phat_hanh;

    public Bao(String matl, String nxb, int sobanphathanh, int ngay_phat_hanh) {
        super(matl, nxb, sobanphathanh);
        this.ngay_phat_hanh = ngay_phat_hanh;
    }

    @Override
    public String toString() {
        return super.toString() + "Bao{" +
                "ngay_phat_hanh=" + ngay_phat_hanh +
                '}';
    }
}
