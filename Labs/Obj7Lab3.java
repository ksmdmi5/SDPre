import java.util.Scanner;

public class Obj7Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection;

    printMenu();
    selection = keyboard.nextInt();
      if (selection == 1) {
      System.out.println("Hello, world!");
      }
    else if (selection == 2) {
      System.out.println("Steak, Potatoes, and Pumpkin Pie");
      }
    else if (selection != 3) {
      System.out.println("Goodbye");
      }
    return (selection != 3);

    }


    public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.print("3: Exit");
    System.out.println();
    }
  }
