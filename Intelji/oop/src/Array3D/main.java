package Array3D;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
       int sl_truong = 5;
        List<School> city= new ArrayList<>();// danh sách các trường

        for (int i = 0; i< sl_truong; i++){
            String ten_truong= "truong "+i;
            School School = new School(ten_truong);
            city.add(School);
        }

        // cho biết thông tin sinh viên( tên trường , lớp, tên và điểm) có điểm trung bình cao nhất TP
        String ten_truong = "sgu";
        String ten_lop = "lop";
        String ten_sv;
        double MaxDiem = 0;
        for (int i = 0; i < sl_truong; i ++){  //duyệt trường
            School truong_dang_xet=city.get(i);
           for (int j = 0 ; j< truong_dang_xet.getClasses().size(); j++){ // duyệt từng lớp
               Class lop_dang_xet = truong_dang_xet.getClasses().get(j);
               for (int e = 0; e< lop_dang_xet.getStudents().size(); e++){
                   Student sv_dang_xet = lop_dang_xet.getStudents().get(e);
                   if (sv_dang_xet.average_score > MaxDiem){
                       MaxDiem = sv_dang_xet.average_score;
                       ten_truong = truong_dang_xet.getName();
                       ten_lop = lop_dang_xet.getName();
                       ten_sv = sv_dang_xet.name;
                   }
               }
           }
        }

        // in diem cua tat ca sinh vien cua tat ca truong;
        for (int i = 0; i < sl_truong; i ++){  //duyệt trường
            School truong_dang_xet=city.get(i);
            for (int j = 0 ; j< truong_dang_xet.getClasses().size(); j++){ // duyệt từng lớp
                Class lop_dang_xet = truong_dang_xet.getClasses().get(j);
                for (int e = 0; e< lop_dang_xet.getStudents().size(); e++){
                    Student sv_dang_xet = lop_dang_xet.getStudents().get(e);
                    System .out.print(sv_dang_xet.average_score+" ");
                }
            }
            System .out.println();
        }

        System .out.println("sv diem cao nhat ="+MaxDiem);
    }
}
