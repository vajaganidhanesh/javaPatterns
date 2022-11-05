public class maxium {
    public static void main(String[] args) {

        int arr[] = {12,33,4,6,7};
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
    }
}
