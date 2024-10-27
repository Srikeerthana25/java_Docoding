import java.util.Scanner;
public class Perfect_number{

 public static void main(String[] args){
 Scanner scan = new Scanner(System.in); 
 System.out.println("enter the number");
 int num = scan.nextInt();
 int sum = 0;
 for(int i =1; i < num; i++){
 if(num % i == 0){
 sum = sum + i;
}
}
 if(sum == num){
 System.out.println("Is perfect number");
}
 else{
System.out.println("Is not perfect number");
}
}

}