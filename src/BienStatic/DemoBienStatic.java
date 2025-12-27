package BienStatic;

import java.sql.SQLOutput;

// Lấy thông tin của sinh viên
public class DemoBienStatic {
    int stt;
    String name;
    static String universityName=" Banking Academy of VietNam";

    DemoBienStatic(int sothutu,String hoTen){
        stt=sothutu;
        name=hoTen;
    }
    public void getInfor(){
        System.out.println("Thông tin của sinh viên:");
        System.out.println("Số thứ tự:"+stt);
        System.out.println("Họ và tên:"+name);
        System.out.println("Học tại:"+universityName);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        DemoBienStatic stu1=new DemoBienStatic(1,"Nguyễn Thị Mai");
        DemoBienStatic stu2=new DemoBienStatic(2,"Tạ Thị Hòa");
        stu1.getInfor();
        stu2.getInfor();

    }
}
