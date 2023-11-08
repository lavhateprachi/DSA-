public class Square {

    public static int square(int num)
    {
        if(num<=0)
            return 0;
        return square(num-1)+2*num-1; //Non_Tail Recursion
    }
    public static void main(String[] args) {

            System.out.println(square(5));
    }
}