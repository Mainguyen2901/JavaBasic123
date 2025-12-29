package Tinhdonggoi;

public class Student {
    private String name;
    private int age;
    private String phone;
    private String address;

    // Hàm khởi tạo có tham số
    public Student( String name,int age,String phone,String address){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
    }
    // Hàm khởi tạo không có tham số
    public Student(){

    }

    // Hàm Getter và Setter
    // Hàm Getter lấy ra thuộc tính name
    public String getName(){
        return name;
    }
    // Hàm Setter Set giá trị cho thuộc tính name
    public void setName(String ten){
        name=ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<200){
        this.age = age;
        }
        else{
            System.out.println("Tuổi "+age+" nhập vào không hợp lệ. Tuổi phải là số lớn hơn 0 và nhỏ hơn 200");
            this.age=0;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

