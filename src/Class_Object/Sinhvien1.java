package Class_Object;

public class Sinhvien1 {
    // Hàm khởi tạo có tham số
    String name;
    int age;

    public Sinhvien1(String ten, int tuoi){
        // Dùng this để phân biệt biến trong class và tham số trong hàm khởi tạo TRÙNG TÊN
        name=ten;
        age=tuoi;
    }
    public void getInfor(){
        System.out.println("Thông tin sinh viên là:"+"\n"+"Họ và tên:"+name+"\n"+"Tuổi:"+age);
    }

    public static void main(String[] args) {
        Sinhvien1 sv1=new Sinhvien1("Nguyễn Thị Mai",30);
        sv1.getInfor();

        // Hàm khởi tạo có tham số

    }
}
