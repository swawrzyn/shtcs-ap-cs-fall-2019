import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    String MelodysName = "Melody";

    int age = 24;

    double pi = 3.1415;

    boolean PassOrFail = true;


    System.out.println(MelodysName + " is cool.");

    int ivanAge = -10;
    boolean zhekeCanDrink = false;

    if (ivanAge >= 21) {
      System.out.println("Congrats! You can drink in the USA.");
    } else if (ivanAge < 0) {
      System.out.println("You can't have negative age.");
    } else {
      System.out.println("No! You can't drink yet.");
    }

    if (zhekeCanDrink) {
      System.out.println("Hey, Zheke can drink!");
    } else if (!zhekeCanDrink) {
      System.out.println("You can't drink Zheke!");
    }

  Scanner input = new Scanner(System.in);
  
  while(true) {
    String stringAge = "";
    System.out.print("What's your age: ");
    stringAge = input.nextLine();
    int intAge = Integer.parseInt(stringAge);

    if (intAge >= 21) {
      System.out.println("Hey! You can drink!!");
      break;
    } else if (intAge < 21) {
      System.out.println("Can't drink! Try again.");
    }
  }
  System.out.println("I'm out of the loop! Goodbye!");
  }
}