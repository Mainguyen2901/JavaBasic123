package Class_Object;

public class Sinhvien {
    String name;
    int age;

    // Hàm khởi tạo KHÔNG có tham số
    public Sinhvien(){
        name="";
        age=0;
    }
    public void getInfor(){
        System.out.println("Thông tin sinh viên là:"+"\n"+"Họ và tên"+name+"\n"+"Tuổi:"+age);
    }

    public static void main(String[] args) {
        Sinhvien sv1=new Sinhvien();
        sv1.name="Nguyễn Thị Mai";
        sv1.age=30;
        sv1.getInfor();

    }
}
