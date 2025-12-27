package BTVN;

public class BT_JAVA_BASIC_3 {
    int number =100;
    public void setNumber(int n){
        if (n==number){
            System.out.println("Số nguyên truyền vào đúng bằng giá trị biến number và bằng:"+n);
        }
        if(n>number){
            System.out.println("Số nguyên truyền vào lớn hơn giá trị biến number và bằng:"+n);
        }
        if(n<number){
            System.out.println("Số nguyên truyền vào nhỏ hơn giá trị biến number và bằng:"+n);
        }

    }
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println("Demo toán tử &&:"+(a<b&&b<c));
        System.out.println("Demo toán tử ||:"+(a>b||b<c));
        System.out.println("Demo toán tử >:"+(a>b));
        System.out.println("Demo toán tử <:"+(b>c));
        System.out.println("Demo toán tử ==:"+(b==c));

        // Khai báo đối tượng
        BT_JAVA_BASIC_3 btvn3=new BT_JAVA_BASIC_3();
        btvn3.setNumber(10);
        btvn3.setNumber(100);

    }
}
