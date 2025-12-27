package If_else;

public class Switch_case {
    public static void main(String[] args) {
        int n=2;
        switch(n){
            case 0:
                System.out.println("Thoát chương trình");
            case 1:
                System.out.println("Thêm sinh viên");
                //break;
            case 2:
                System.out.println("Sửa thông tin sinh viên");
                //break;
            case 3:
                System.out.println("Xóa thông tin sinh viên");
                //break;
            case 4:
                System.out.println("Xem danh sách sinh viên");
                //break;
            default:
                System.out.println("Giá trị bạn nhập vào không hợp lệ. Vui lòng nhập số từ 0 đến 5");
        }
    }
}
// Mệnh đề Switch_case nếu không sử dụng break thì nó sẽ chạy hết các trường hợp đằng sau trường hợp đã thỏa mãn.