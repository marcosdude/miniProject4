import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    System.out.println("Hello! The Jerseys are finally in! We need your name and favorite number for your soccer jersey!");
    Scanner scan = new Scanner(System.in);
    System.out.println("What name would you like on your jersey?");
    String playersName = scan.next();
    System.out.println("What number would you like on your jersey?");
    int favoriteNumber = scan.nextInt();

  System.out.println("This is your Jersey.");

  String Name = playersName;
   System.out.println("The name on your jersey would be, " + Name + ".");

  int Number = favoriteNumber;
   System.out.println("The number on your jersey would be, " + Number + ".");
  }


  static String getName(String playersName)
  {
    String Name = playersName;
    return Name; 
  }

  static int getNumber(int favoriteNumber)
  {
    int Number = favoriteNumber;
    return Number; 
  }



}