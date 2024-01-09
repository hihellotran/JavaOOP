package Array3D;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class {
    private String name;
    private List<Student> students;
    // bộ khởi tạo lớp học với danh học sinh là ngẫu nhiên
    public Class(String name){
        students = new ArrayList<>();
        Random random = new Random();
        int soluongpt = random.nextInt(20)+10;
        // khởi tạo ngẫu nhiên các học sinh( cho nhanh chứ nhập tay thấy mụ nội lun)
        for (int i = 0; i<soluongpt; i++){
            //String school = "school" + (i+1);
            String sclass = "class" + (i+1);
            double score = random.nextDouble(10);//0-> trước số 10
            Student student = new Student(name, sclass, score);
            students.add(student);
        }
    }

    public Class(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
