import java.util.Scanner;

public class NhanVien {
    private String id;
    private String name;
    private int age;

    public NhanVien(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public NhanVien(){}

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id:");
        this.id = scanner.nextLine();
        System.out.println("Nhập tên:");
        this.name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        this.age = scanner.nextInt();
    }

    public void Xuat(){
        System.out.println("Id: " + this.id);
        System.out.println("Tên: " + this.name);
        System.out.println("Tuổi: " + this.age);

    }

    public void VeHuu(){
        if(this.age>=60){
            System.out.println("Được về hưu");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
