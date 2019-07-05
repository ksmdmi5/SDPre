import java.util.Scanner;

public class Obj6Lab5 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection;

    do  {
        System.out.println("____Menu____");
        System.out.println("1: Say Hello");
        System.out.println("2: List My Favorite Foods");
        System.out.print("3: Exit");
        System.out.println();
        selection = keyboard.nextInt();

        if (selection == 1) {
          System.out.println("Hello, human!");
          }
        else if (selection == 2)
          System.out.println("Steak, Potatoes, and Pumpkin Pie");

        else if (selection != 3)
          System.out.println("Goodbye");

        }  while (selection != 3);

  }
}
