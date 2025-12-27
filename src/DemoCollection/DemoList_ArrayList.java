package DemoCollection;

import java.util.ArrayList;
import java.util.List;

public class DemoList_ArrayList {
    // Khai báo một cái List
    public static void main(String[] args) {
        List<String> arrayList= new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");

        //arrayList.remove(1);// Xóa phần tử thứ 2 trong danh sách
        //arrayList.removeAll(arrayList);

        System.out.println("Các phần tử của ArrayList:");
        System.out.println(arrayList);

        // Kiểm tra xem danh sách có chứa giá trị Java123 không?
        System.out.println("Kiểm tra chưa giá trị Java123:"+arrayList.contains("Java123"));

        // Lấy ra số lượng phần tử của danh sách
        System.out.println("Số lượng phần tử của danh sách là:"+arrayList.size());

        // Duyệt các phần tử bằng vòng lặp FOR cơ bản
        System.out.println("Liệt kê các phần tử của Array List theo FOR cơ bản là:");

        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        //Duyệt vòng lặp for bằng For-Each
        System.out.println("Liệt kê các phần tử của ArrayList theo For-Each:");
        for(String obj:arrayList){
            System.out.print(obj+",");
        }
    }
}
