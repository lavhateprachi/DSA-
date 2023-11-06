import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearch(int[] arr,int key)
    {
        int left =0,right= arr.length-1;

        while(left<right) {
            int mid = (left + right) / 2;

            if (key == arr[mid])
                return mid;

            if (key < arr[mid]) {
                right = mid - 1;
            }
            if (key > arr[mid])
                left = mid + 1;
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {22,44,88,55,11,99,77,33,66};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter key to search: ");
        int key=sc.nextInt();

        int index= BinarySearch(arr,key);
        if(index!=-1)
            System.out.println("Element found at index ="+index);
        else
            System.out.println("Not found");
    }
}
