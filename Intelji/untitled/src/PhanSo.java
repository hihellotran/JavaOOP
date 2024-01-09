public class PhanSo {
    int tu;
    int mau;

    public PhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo Cong(PhanSo p){
        p.tu = this.tu * p.mau + p.tu * this.mau;
        p.mau = p.mau + this.tu;
        return p;
    }

    public void RutGon(){
        int ucln = UCLN(this.tu, this.mau);
        this.tu = this.tu/ucln;
        this.mau = this.mau/ucln;
    }

    private int UCLN(int a, int b ){//a=8 b=12
        int gtnn_a_b ;//= a<b?a:b;
        int ucln = 1;
        if(a<b)
            gtnn_a_b=a;
        else
            gtnn_a_b=b;
        for (int i = 1; i<=gtnn_a_b; i++){
            if(a%i==0 && b%i==0){
                ucln = i;

            }
        }
        return ucln;

    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
