package PhamViTruyCap.PhamviProtected;

import PhamViTruyCap.Common.BaseTest;

public class Technology extends BaseTest{
    public void ShowInfor(){
        Computer computer =new Computer();
        System.out.println(computer.getComputerName());// Không kế thừa thì phải khởi tạo đối tượng
        System.out.println(getBrowser());// Kế thừa thì không  cần khởi tạo đối tượng
    }

    public static void main(String[] args) {
        Technology technology=new Technology();
        technology.ShowInfor();
    }
}
