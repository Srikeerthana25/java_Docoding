import java.util.Scanner;
public class Overload {
    
    public static int add(int a,int b){
        return(a+b);
    }
    public static double add(double a,double b){
        return(a+b);
    }
    public static int add(int a,int b,int c){
        return(a+b+c);
    }

    public static void main(String[] args) {
       
        System.out.println(Overload.add(5,4));
        System.out.println(Overload.add(5,4,1));
        System.out.println(Overload.add(5.0,4.5));
       
    }
}
