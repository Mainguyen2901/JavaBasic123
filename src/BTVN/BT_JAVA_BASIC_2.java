package BTVN;

public class BT_JAVA_BASIC_2 {
    public int Tong(int a, int b){
        return a+b;
    }
    public float Tich (float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
        BT_JAVA_BASIC_2 Tinh=new BT_JAVA_BASIC_2();
        System.out.println(Tinh.Tong(3,5));
        System.out.println(Tinh.Tich(1.2f,3.5f));
    }

}
