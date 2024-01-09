public class TaiLieu {
    String matl;
    String nxb;
    int sobanphathanh;

    public TaiLieu(String matl, String nxb, int sobanphathanh){
        this.matl = matl;
        this.nxb = nxb;
        this.sobanphathanh = sobanphathanh;
    }


    @Override
    public String toString() {
        return "TaiLieu{" +
                "matl='" + matl + '\'' +
                ", nxb='" + nxb + '\'' +
                ", sobanphathanh=" + sobanphathanh +
                '}';
    }
}
