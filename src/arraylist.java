import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);

//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(6);
//        arrayList.add(8);
//        arrayList.add(10);
//
//        arrayList.set(0, 67);
//        arrayList.remove(3);

        for (int i = 1; i <= 5; i++) {

            arrayList.add(in.nextInt());
//            if(i%2 ==0){
//                arrayList.add(i*2);
//            }
//            else{
//                arrayList.remove(i);
//            }
        }

        for (int i = 0; i <5; i++) {
            System.out.println("hello : "+arrayList.get(i));
        }
//        System.out.println(arrayList);
    }
}
