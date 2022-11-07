
public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {12,32,45,65,70};
        int target = 45;
        int answer = linear_Search(arr,target);
        System.out.println("index of target value is : "+answer);
    }
    static int linear_Search(int[] arr, int target)
    {
        if(arr.length ==0){
            return -1;
        }
        for (int index = 0; index <arr.length ; index++) {
            int element = arr[index];
            if(element == target)
                return index;
        }
        return -1;
    }
}
