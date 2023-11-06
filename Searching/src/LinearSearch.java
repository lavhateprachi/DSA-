import java.util.Scanner;

public class LinearSearch {

    public static int LinearSearch(int[] arr,int key)
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                return i;

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {22,44,88,55,11,99,77,33,66};
        System.out.println("Enter key to search: ");
        int key=sc.nextInt();

       int index= LinearSearch(arr,key);
        if(index!=-1)
            System.out.println("Element found at index ="+index);
        else
            System.out.println("Not found");
    }


}