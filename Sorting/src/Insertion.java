import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void insertion(int arr[])
    {
        int n = arr.length;
        int i,j,x;
        for(i=1;i<=n-1;i++)
        {
            j=i-1;
            x=arr[i];
            while(j>=0 && arr[j]>x)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;

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
        insertion(arr);

        //array after sorting
        System.out.println("Array After Sorting: "+ Arrays.toString(arr));
    }
}
