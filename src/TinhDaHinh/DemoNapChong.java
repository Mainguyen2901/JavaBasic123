package TinhDaHinh;

public class DemoNapChong {
    public int tinhTong(int number1,int number2){
        return number1+number2;
    }
// Hai hàm khác nhau về số lượng tham số
    public int tinhTong(int number1,int number2, int number3){
        return number1+number2+number3;
    }
// Hai hàm cùng số lượng tham số thì phải khác nhau về kiểu giá trị của các biến
    public double tinhTong(int number1, int number2, double number3){// Chú ý kiểu phưong thức trả về
        return number1+number2+number3;
    }
    public void createBrowse(String browserName){
        System.out.println("Chạy với trình duyệt:"+browserName);

    }
    public void createBrowse(){
        System.out.println("Chạy với trình duyệt mặc định Chrome");
    }

    public static void main(String[] args) {
        DemoNapChong napchong =new DemoNapChong();
        System.out.println(napchong.tinhTong(2,3,5));;

        napchong.createBrowse("Edge");
        napchong.createBrowse();
    }
}
