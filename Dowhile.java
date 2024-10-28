import java.util.Scanner;
public class Dowhile {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice;
       
        do{
            System.out.println("Enter the number:");
            int num = scan.nextInt();
            if (num < 0 ){
                System.out.println(num + " is negative");
            }
            else if( num > 0){
             System.out.println(num + "is positive");
            }
            else{
                System.out.println("Zero");
            }
            System.out.println( "Repeat yes/no");
            choice = scan.next().charAt(0);
        }
       

        while(choice =='y' || choice == 'Y');

     }
}
