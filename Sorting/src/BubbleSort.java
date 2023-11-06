import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{
        public static void bubble(int array[])
        {
            int n=array.length;
            boolean ifSorted=false;
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                        ifSorted=true;
                    }
                }
                if(!ifSorted)
                    break;
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
            bubble(arr);

            //array after sorting
            System.out.println("Array After Sorting: "+ Arrays.toString(arr));
        }
}


