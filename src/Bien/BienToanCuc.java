package Bien;

public class BienToanCuc {
    String address="Hà Nội";

    public String getName(){
        String name="Vinh";
        System.out.println(address);
        return name;
    }

    public void getInfor(){
        System.out.println(address);
    }
    public static void main(String[] args) {
        BienToanCuc instance=new BienToanCuc();
        instance.getName();
        instance.getInfor();
    }
}
