import java.util.Scanner;

public class PigDice
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);

      int roll, total1, total2, turnTotal;
      String choice = "";

      total1 = 0;
      total2 = 0;

      do
      {
        turnTotal = 0;
        System.out.println("You have "+total1+" points.");

      do
      {
          roll = 1 + (int)(Math.random()*6);
          System.out.println("\tYou rolled a "+roll+".");
          if (roll == 1)
          {
            System.out.println("\tThat ends your turn.");
            turnTotal = 0;
          }
          else
          {
            turnTotal += roll;
            System.out.println("\tYou hvae "+turnTotal+" points so far: ");
            System.out.println("\tWould you like to \"roll\" again or \"hold\"? ");
            choice = keyboard.next();
           }
       }  while (roll != 1 && choice.equals("roll") );

      total1 += turnTotal;
      System.out.println("\tYou end the round with "+total1+" points." );

      if (total1 < 100)
      {
        turnTotal = 0;
        System.out.println("Computer has "+total2+" points." );

        do
        {
            roll = 1 + (int)(Math.random()*6);
            System.out.println("\tComputer rolled a "+roll+"." );
            if (roll == 1)
            {
              System.out.println("\tThat ends its turn." );
              turnTotal = 0;
            }
            else
            {
              turnTotal += roll;
              System.out.println("\tComputer has "+turnTotal+" points so far this round.\n");
              if (turnTotal < 20 )
              {
                System.out.println("\t Computer chooses to roll again." );
              }
            }
        } while (roll != 1 && turnTotal < 20 || turnTotal >= 100 );

        total2 += turnTotal;
        System.out.println("\tComputer ends the round with "+total2+".");
      }

    } while (total1 < 100 && total2 < 100);

    if (total1 > total2)
    {
      System.out.println("Humanity wins!" );
    }
    else
    {
      System.out.println("The computer wins.");
    }

  }
}
