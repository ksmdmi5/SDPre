public class CreatingVariables
{
    public static void main( String[] args )
    {
        int x, y, age, j;
        double seconds, e, checking, dog;
        String firstName, last_name, title, title1, title2;

        x = 10;
        y = 400;
        age = 27;
        j = 12;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        dog = 1;


        firstName = "Cody";
        last_name = "Fulker";
        title = "Mr.";
        title1 = "The";
        title2 = "Confused";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "My age is " + age + " years old." );
        System.out.println( "I have jumped out of a plane " + j + " times." );
        System.out.println( "The experiment completed in " + seconds + " seconds." );
        System.out.println( "My favorite irrational number is Euler's constant: " + e );
        System.out.println( "Hopefully your balance is more than $" + checking + "!" );
        System.out.println( "And more than " + dog + "dog at home to greet you." );
        System.out.println( "My full name is " + title + " " + firstName + last_name );
        System.out.println(                               title1 + title2 );
    }
}
