import java.util.Scanner;

public class ForgetfulMachine
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "What city is the capital of France?" );
        keyboard.next();

        System.out.println( "What is 6 multiplied by 7?" );
        keyboard.nextInt();

        System.out.println( "What is your favorite number between 0.0 and 1.0?" );
        keyboard.nextDouble();

        System.out.println( "Is there anything else you would like to tell me?" );
        keyboard.next();

        // The 2nd question blows up when I type 69.1.
        // The 3rd question blows up when i type 3.1978356% because it is a percentange.
    }
}
