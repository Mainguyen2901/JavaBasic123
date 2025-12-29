package TinhKeThua;

public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name,int age,float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public void getInfor(){
        System.out.println("Họ và tên:"+name);
        System.out.println("Tuổi:"+age);
        System.out.println("Height:"+height);
    }
}
