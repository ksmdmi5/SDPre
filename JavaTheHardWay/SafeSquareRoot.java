import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double x, y;

        System.out.print("Give me a number, and I shall find the square root of it. ");
        System.out.print("Are you reaaady?");
        String readyanswer = keyboard.nextLine();

        while( !readyanswer.equals("yes"))
            readyanswer = keyboard.nextLine();

        System.out.print("(No negatives, please.) ");
        x = keyboard.nextDouble();

        while (x < 0)
        {
          System.out.print("Sorry, I won't take the sqaure root of a negative.\nNew number: ");
          x = keyboard.nextDouble();
        }

        y = Math.sqrt(x);

        System.out.println("the square root of "+x+" is "+y);
    }
}
