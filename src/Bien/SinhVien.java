package Bien;

public class SinhVien {
    String interest=" Learning Automation Testing";

    static String universityName="Banking Academy of VietNam";
    public void getInfor(){
        String name="Nguyễn Thị Mai";
        int age=21;
        String job="Automation testing";
        System.out.println("Thông tin giới thiệu về tôi:");
        System.out.println("Họ và tên:"+name+";Tuổi"+age+";Nghề nghiệp"+job+";Sở thích"+interest+";"+universityName);
    }
    public static void main(String[] args) {
        SinhVien sv1=new SinhVien();
        sv1.getInfor();
        System.out.println(SinhVien.universityName);
    }
}
