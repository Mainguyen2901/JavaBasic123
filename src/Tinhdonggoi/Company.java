package Tinhdonggoi;

public class Company extends Student {
    public void showInfor(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getPhone());
        System.out.println(getAddress());

    }
    public static void main(String[] args) {
        //Student student=new Student("Nguyễn Thị Mai",30,"0368226561","Nam Định");
        Student student=new Student();

        student.setAge(30);
        student.setName("Nguyễn Thị Mai");
        student.setAddress("Nam Định");
        student.setPhone("0368226561");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getPhone());
        System.out.println(student.getAddress());

        Company company=new Company();
        company.showInfor();

    }
}
