import java.util.Scanner;

public class RudeQuestions
{
    public static void main( String[] args )
    {
        String name, snack;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you?" );
        age = keyboard.nextInt();

        System.out.println( "So you're " + age + ", eh? That's not old at all." );
        System.out.print( "How much do you weigh, " + name + "? " );
        weight = keyboard.nextDouble();

        System.out.print( weight + "! Better keep that quiet. What's your income?");
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour and not per year!" );
        income = keyboard.nextDouble();

        System.out.print( "Finally, what's your favorite snack? " );
        snack = keyboard.next();
        System.out.println( snack + " ? Me too!" );

        System.out.println( "Well, thanks for answering my rude questions, " + name + "." );
        // 1. Yes, the program does blow up when inserting a double into an int, probably because an int is an
        // exact value while a double is an approximate fraction.
        // 2. No the program does not blow up when inserting a number in to a string, probably because the String
        // has no reference for whatever the "value" is.
        // 3. Most commonly when entering a symbol such as "$" or "%" the program blows up due to having no reference
        // for how to interpret these symbols while the string does blow up if you have a space in the name such "Billy Bob,"
        // my guess is it doen't know how to handle "nothing" being there some other value.
    }
}
