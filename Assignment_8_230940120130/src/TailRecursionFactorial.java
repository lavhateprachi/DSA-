import java.util.Scanner;

public class TailRecursionFactorial {

    public static int factorial(int num,int acc)
    {
        if(num==0)
            return acc;
        return factorial(num-1,num*acc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int result=factorial(num,1);
        System.out.println(result);
    }
}
