import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        String arr1[] = new String[4];

        arr[0] = 34;

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = in.next();
            }

            System.out.println(Arrays.toString(arr1));

//            for (int i = 0; i < arr1.length; i++) {
//                System.out.print(arr1[i] + " ");
//            }

//            for (int j : arr) {
//                System.out.print(j + " ");
//            }
        }
}
