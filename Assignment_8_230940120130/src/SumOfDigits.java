import java.util.Scanner;

public class SumOfDigits {

    public static int sumDigits(int number)
    {
        int sum =0;
        if(number<=0)
            return sum;
        int digit = number%10;
        sum=sum+digit;
        number=number/10;

        return sum+sumDigits(number);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        int result=sumDigits(num);
        System.out.println("Number: "+num+" Result: "+result);

    }
}
