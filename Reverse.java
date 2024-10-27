import java.util.Scanner;

public class Reverse{

  public static void main(String[] args){
  
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the number:");
  int number = scan.nextInt();
  System.out.println("The given number is" + number);
  
  int reverse = 0;
  

   while (number != 0){
  int lastnum = number % 10;
  reverse = reverse * 10 + lastnum;
  number = number / 10;
}

  System.out.println(reverse);
  scan.close();
}
}
  
  