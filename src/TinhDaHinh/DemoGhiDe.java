package TinhDaHinh;
import PhamViTruyCap.Common.BaseTest;

public class DemoGhiDe extends BaseTest {
    public void createBrowser(){
        System.out.println("Run on Chrome Browser");
        System.out.println("Config chặn notification");
        System.out.println("Config chặn save password");
        System.out.println("Chạy chế độ Headless");
    }
    public void testAddUser(){
        createBrowser();
    }

    public static void main(String[] args) {
        DemoGhiDe demoGhide=new DemoGhiDe();
        demoGhide.createBrowser();

    }
}
