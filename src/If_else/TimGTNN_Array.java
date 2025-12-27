package If_else;
public class TimGTNN_Array {
    static void min(int a[]){
        int min=a[0];
//        for(int i=0;i<a.length;i++){
//            if(min>a[i]){
//                min=a[i];
//            }
//        }
//        System.out.println(min);
// Cách 2:
        for (int x:a){
            if(min>x){
                min=x;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        min(a);
    }
}
