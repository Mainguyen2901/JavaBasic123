package TinhKeThua;

public class Student extends Person{
    public String universityName;
    public Student(String name, int age, float height, String universityName){// Hàm khởi tạo có tham số
        super(name,age,height);// Bắt buôc phải khởi tạo hàm constructor bên class Person
        this.universityName=universityName;
    }
    public void getInfor(){
        super.getInfor();// Gọi từ class Person
        System.out.println("Học tại:"+universityName);// Tính đa hình hay còn gọi là ghi đè

        // Nếu cha và con đều có chung phương thức thì ưu tiên sử dụng class con.
    }
    public static void main(String[] args) {
        Student stu1=new Student("Nguyễn Thị Mai",21,1.61f,"Banking Academy of VietNam");
        stu1.getInfor();
    }
}
