package Class_Object;

public class Student {
    int stt;
    String ten;
    // Hàm lấy thông tin sinh viên
    public void setInfor(int id, String name){
        this.stt=id;
        this.ten=name;
    }
    public void getInfor(){
        System.out.println("Số thứ tự:"+stt);
        System.out.println("Họ và tên:"+ten);
        System.out.println("================");
    }

    public static void main(String[] args) {
        Student student1=new Student();
        student1.setInfor(1,"Nguyễn Thị Mai");
        student1.getInfor();
        Student student2=new Student();
        student2.setInfor(2,"Nguyễn Thị Thu Hiền");
        student2.getInfor();

    }
}
