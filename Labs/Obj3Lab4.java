import java.util.Scanner;

public class Obj3Lab4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String firstName, lastName;
    int age;

    System.out.println("What is your first name? ");
    firstName = keyboard.next();
    System.out.println("What is your last name? ");
    lastName = keyboard.next();
    System.out.println("How old are you? ");
    age = keyboard.nextInt();
    System.out.println("First Name: "+firstName+", Last Name: "+lastName+", Age: "+age);

  }
}
