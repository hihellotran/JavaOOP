package Array3D;

public class Student {

    String school;
    String s_class;
    String name;

    double average_score;

    public Student(String school, String s_class, double average_score) {
        this.school = school;
        this.s_class = s_class;
        this.average_score = average_score;
    }
    public Student(){

    }

    public void Search(){

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getS_class() {
        return s_class;
    }

    public void setS_class(String s_class) {
        this.s_class = s_class;
    }

    public double getAverage_score() {
        return average_score;
    }

    public void setAverage_score(double average_score) {
        this.average_score = average_score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", s_class='" + s_class + '\'' +
                ", average_score=" + average_score +
                '}';
    }
}
