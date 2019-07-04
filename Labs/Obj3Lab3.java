import java.util.Scanner;

public class Obj3Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int birthYear, age, currentYear;

    birthYear = 0;

    System.out.println("How old are you?" );
    age = keyboard.nextInt();

    currentYear = 2019;
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);

  }
}
