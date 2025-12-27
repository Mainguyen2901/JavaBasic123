package DemoCollection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet_HashSet {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<String>();
        //HashSet<String> hashSet=new HashSet<String>();// Cách khởi tạo thứ 2
        hashSet.add("Java");
        hashSet.add("C++");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Cơ sở dữ liệu");

        // Lưu ý vì set lưu giá trị ngẫu nhiên nên không thể xóa phần tử theo vị trí.
        // Do đó phải xóa phần tử theo giá trị
        hashSet.remove("Python");

        System.out.println("Các phần tử trong danh sách:"+hashSet);

        System.out.println("Số lượng phần tử trong danh sách:"+hashSet.size());

        System.out.println("Liệt kê các phần tử của ArrayList theo For-Each:");
        for(String obj:hashSet){
            System.out.print(obj+",");
        }
    }
}
