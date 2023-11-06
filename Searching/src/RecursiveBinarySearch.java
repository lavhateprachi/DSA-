import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {
    public static int BinarySearch(int[] arr,int left,int right,int key){
        while(left<right) {
            int mid = (left + right) / 2;

            if (key == arr[mid])
                return mid;

            if (key < arr[mid]) {
                return BinarySearch(arr,left,mid-1,key);
            }
            if (key > arr[mid])
                return BinarySearch(arr,mid+1,right,key);
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

        int left=0,right=arr.length-1;
        int index= BinarySearch(arr,left,right,key);
        if(index!=-1)
            System.out.println("Element found at index ="+index);
        else
            System.out.println("Not found");
    }
}
