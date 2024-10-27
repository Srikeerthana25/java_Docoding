import java.util.Scanner;

public class Palindrome{
 
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);

 System.out.println("Enter the string :");
 String name = scan.next();
 String rev = "";

 for(int i = name.length()-1; i >=0; i--)
 rev = rev + name.charAt(i);

if(rev.equals(name))
    System.out.println(name + " is palindrome");
  else
System.out.println(name + " is not palindrome");
 
 
  }
}