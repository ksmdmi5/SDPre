import java.util.Scanner;

public class Obj4Lab1 {
  public static void main(String[] arsg) {
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;

    System.out.println("Please enter a number: ");
    num1 = keyboard.nextInt();
    System.out.println("Please enter a second number: ");
    num2 = keyboard.nextInt();

    if ( num1 > num2 )
      System.out.println(num1+" is greater than "+num2+".");

    else if (num2 > num1)
      System.out.println(num2+" is greather than "+num1+".");

  }
}
