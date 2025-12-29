package PhamViTruyCap;

public class Person {
    private int data=40;
    private void msg(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.data);
        person.msg();

    }
}
