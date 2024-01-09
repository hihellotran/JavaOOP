public class Product {
    private String sp_ten;
    private String mo_ta;
    private double gia;
    private int sl;

    public Product(String sp_ten, String mo_ta, double gia, int sl){
        this.sp_ten = sp_ten;
        this.mo_ta = mo_ta;
        this.gia = gia;
        this.sl = sl;
    }
    public String getSp_ten() {
        return sp_ten;
    }

    public void setSp_ten(String sp_ten) {
        this.sp_ten = sp_ten;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sp_ten='" + sp_ten + '\'' +
                ", mo_ta='" + mo_ta + '\'' +
                ", gia=" + gia +
                ", sl=" + sl +
                '}';
    }
}
