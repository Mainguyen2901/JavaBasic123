package DemoCollection;

public class BT_JAVA_BASIC_4 {
    public static void main(String[] args) {
        int count=0;
        for( int i=0;i<=50;i++){
            if(i%2==0){
                count++;
            }
        }
        // Khởi tạo một mảng
        int arr[]= new int[count];
        // Tạo một mảng để lưu các số chẵn từ 0-50
        int index=0;

        for (int i=0;i<=50;i++){
            if(i%2==0){
                arr[index]=i;
                index++;
            }

        }
        // Duyệt mảng để in ra kết quả
        for (int so:arr){
            System.out.println(so);
        }
    }
}
