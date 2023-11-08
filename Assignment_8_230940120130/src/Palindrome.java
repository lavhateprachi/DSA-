import java.util.Scanner;

public class Palindrome {
    public static int CheckPalindrome(int number,int rev)
    {
        if(number==0)
            return rev;
        int rem;
        rem=number%10;
        rev=rev*10+rem;
        number=number/10;

        return CheckPalindrome(number,rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0;
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int result = CheckPalindrome(num,rev);
        if(result==num)
            System.out.println("Palindrome...");
        else
            System.out.println("Not Palindrome...");

        System.out.println(result);
    }
}
