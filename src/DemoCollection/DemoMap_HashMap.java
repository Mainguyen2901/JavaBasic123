package DemoCollection;

import java.util.HashMap;
import java.util.Map;
// Dùng trong file Excel

public class DemoMap_HashMap {
    public static void main(String[] args) {
        Map<String,String> hashMap=new HashMap<String,String>();
        hashMap.put("Windows","2000");
        hashMap.put("Windows","XP");
        hashMap.put("Language1","Java");
        hashMap.put("Language2",".Net");

        System.out.println("Các phần tử trong Map:"+"\n"+hashMap);

        hashMap.remove("Windows");
        System.out.println(hashMap.containsKey("Language11"));
        System.out.println(hashMap.containsValue("Java"));
        System.out.println("Các phần tử trong Map:"+"\n"+hashMap);
        // 2 trường hợp mình dùng nhiều là đọc data trong Excel và Json
        // Thiết lập config cho Driver trong Selenium

        // Truy xuất giá trị theo từng key
        System.out.println(hashMap.get("Language1"));

        //Get hết giá trị của Key và value
        for(Map.Entry<String,String> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
