package Array3D;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class School {
    private String name;
    private List<Class> classes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public School(String name, List<Class> classes) {
        this.name = name;
        this.classes = classes;
    }

    public School(String ten_nguoi_dung_muon) {
        this.name = ten_nguoi_dung_muon;
        classes = new ArrayList<>();
        Random random = new Random();
        int so_lop = random.nextInt(50) + 20;
        // khởi tạo ngẫu nhiên các lớp học
        for (int i = 0; i < so_lop; i++) {
            String class_name = "Class" + (i + 1);
            Class lop = new Class(class_name);// bộ khơi tạo này sẽ tạo ngẫu nhiên các học sinh
            classes.add(lop);
        }
    }
}
