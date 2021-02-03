import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    System.out.println("Hello! the Jerseys are finally in! We need your name and favorite number for your soccer jersey!");
    Scanner scan = new Scanner(System.in);
    System.out.println("What name would you like on your jersey?");
    String playersName = scan.next();
    System.out.println("What number would you like on your jersey?");
    int favoriteNumber = scan.nextInt();

  System.out.println("This is your information.");

  String Name = playersName;
   System.out.println(Name);

  int Number = favoriteNumber;
   System.out.println(Number);
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