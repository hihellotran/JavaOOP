import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        String[] sach ={"Kỳ đồng", "Văn học", "Thế giới", "Chính trị"};
        String[] bao = {"Tuổi trẻ", "Lao động", "Thanh niên"};
        String[] tapchi = {"Vouge", "Cambrige", "Wiley"};

        String[] name = {"a", "b", "c", "d", "e", "f"};

        QLSach qlSach = new QLSach();

       while (true){
           System.out.println("1.Thêm sách");
           System.out.println("2.Tìm kiếm theo mã");
           System.out.println("3.Hiển thị");
           System.out.println("4.Xóa tài liệu ");
           System.out.println("5.Thoát");

           System.out.println("Nhập lựa chọn:");
           Scanner scanner = new Scanner(System.in);
           int choice = scanner.nextInt();

           switch (choice){
               case 1:

                   System.out.println("Chọn loại tài liệu muốn thêm");
                   System.out.println("1.Sách");
                   System.out.println("2.Báo");
                   System.out.println("3.Tạp chí");

                   int nhap = scanner.nextInt();
                   scanner.nextLine();

                   if(nhap ==1){
                       System.out.println("Nhập mã tài liệu:");
                       String ma_tl = scanner.nextLine();

                       System.out.println("Nhập nhà xuất bản:");
                       String nha_xb = sach[random.nextInt(sach.length)];

                       System.out.println("Nhập số bản phát hành:");
                       int ban_ph = random.nextInt(10)+1;

                       System.out.println("Tên tác giả:");
                       String ten_tg = name[random.nextInt(name.length)];

                       System.out.println("Số trang:");
                       int trang = random.nextInt(100)+1;

                       Sach s = new Sach(ma_tl, nha_xb, ban_ph, ten_tg, trang);
                       qlSach.ThemSach(s);

                   }

                   else if (nhap == 2)
                   {
                       System.out.println("Nhập mã tài liệu:");
                       String ma_tl = scanner.nextLine();

                       System.out.println("Nhập nhà xuất bản:");
                       String nha_xb = sach[random.nextInt(sach.length)];

                       System.out.println("Nhập số bản phát hành:");
                       int ban_ph = random.nextInt(10)+1;

                       System.out.println("Số phát hành:");
                       int so_ph = random.nextInt(10)+1;

                       Bao b = new Bao(ma_tl, nha_xb, ban_ph, so_ph);
                       qlSach.ThemSach(b);
                   }

                   else if (nhap == 3){
                       System.out.println("Nhập mã tài liệu:");
                       String ma_tl = scanner.nextLine();

                       System.out.println("Nhập nhà xuất bản:");
                       String nha_xb = sach[random.nextInt(sach.length)];

                       System.out.println("Nhập số bản phát hành:");
                       int ban_ph = random.nextInt(10)+1;

                       System.out.println("Số phát hành:");
                       int so_ph = random.nextInt(10)+1;

                       System.out.println("Tháng phát hành:");
                       int thang_ph = random.nextInt(12)+1;

                       TapChi tc = new TapChi(ma_tl, nha_xb, ban_ph, so_ph, thang_ph);
                       qlSach.ThemSach(tc);

                   }
                   else {
                       System.out.println("không hợp lệ");

                   }
                   break;

               case 2:
                   System.out.println("Nhập mã");
                   scanner.nextLine();
                   String search = scanner.nextLine();
                   qlSach.TimKiem(search);
                   break;

               case 3:
                   qlSach.HienThi();
                   break;


               case 4:
                   System.out.println("Nhập mã");
                   scanner.nextLine();
                   String delete = scanner.nextLine();
                   qlSach.Xoa(delete);
                   break;

               case 5:
                   System.exit(0);
                   break;

               default:
                   System.out.println("Không hợp lệ");
                   break;
           }

       }

    }
}