import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selection(int arr[])
    {
        int n= arr.length;
        int i,j,k;
        for(i=0;i<n-1;i++)
        {
            for(j=k=i; j<n;j++)
            {
                if(arr[j]<arr[k])
                {
                    k=j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        //Display Array Elements
        System.out.println("Array Before Sorting: ");
        for(int Array: arr)
        {
            System.out.println(Array+" ");
        }
        //function call
        selection(arr);

        //array after sorting
        System.out.println("Array After Sorting: "+ Arrays.toString(arr));
    }
}
