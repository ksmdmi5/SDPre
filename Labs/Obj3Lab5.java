import java.util.Scanner;

public class Obj3Lab5 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double a, b, c;

    System.out.println("Please enter a number: ");
    a = keyboard.nextDouble();
    System.out.println("Please enter a second number: ");
    b = keyboard.nextDouble();

    c = a + b;

    System.out.println("The sum of "+a+" and "+b+" equals "+c);
  }
}
