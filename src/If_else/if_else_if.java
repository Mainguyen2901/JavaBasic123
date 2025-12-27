package If_else;

public class if_else_if {


    public static void main(String[] args) {
        float gpa=-3.6f;
//        if (0<=gpa&&gpa<2){
//            System.out.println("Học lực Yếu");
//        }
//        else if(gpa>=2&&gpa<2.5){
//            System.out.println("Học lực Trung bình");
//        }
//        else if(gpa>=2.5&&gpa<3.2){
//            System.out.println("Học lực Khá");
//        }
//        else if(gpa>=3.2&&gpa<3.6){
//            System.out.println("Học lực Giỏi");
//        }
//        else if(gpa>=3.6&&gpa<=4){
//            System.out.println("Học lực Xuất xắc");
//        }
//        else{
//            System.out.println("Giá trị bạn nhập vào không hợp lệ.");
//        }
        if (gpa < 0 || gpa > 4) {
            System.out.println("Giá trị không hợp lệ");
        } else if (gpa < 2) {
            System.out.println("Học lực Yếu");
        } else if (gpa < 2.5) {
            System.out.println("Học lực Trung bình");
        } else if (gpa < 3.2) {
            System.out.println("Học lực Khá");
        } else if (gpa < 3.6) {
            System.out.println("Học lực Giỏi");
        } else {
            System.out.println("Học lực Xuất sắc");
        }
    }
}
