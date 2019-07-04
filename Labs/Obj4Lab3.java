import java.util.Scanner;

public class Obj4Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int num;

    System.out.println("Please enter a number: ");
    num = keyboard.nextInt();
    if (num >= 0) {
      System.out.println("The number is positive.");
    }

    else if(num < 0) {
      System.out.println("The number is negative.");
    }
  }
}
