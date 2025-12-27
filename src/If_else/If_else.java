package If_else;
public class If_else {
    public static void main(String[] args) {
//        int age=40;
//        if(age>30){
//            System.out.println("Tuổi của bạn lớn hơn ba mươi tuổi");
//        }
//        else{
//            System.out.println("Tuổi của bạn nhỏ hơn hoặc bằng 30.");
//        }
        // Kiểm tra số chẵn
//        int a=13;
//        if(a%2==0){
//            System.out.println("Số "+a+" là số chẵn.");
//        }
//        else{
//            System.out.println("Số "+a+" là số lẻ.");
//        }
        // Kiểm tra một số có phải là số nguyên tố hay không?
        int n=3;
        int a=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                a++;
            }
        }
        if (a == 2) {
            System.out.println("Số n "+n+" là số nguyên tố");
        }
        else{
            System.out.println("Số n "+n+" không phải là số nguyên tố");
        }
    }

}
