public class Factorial {
    public static int calcFactorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * calcFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of" + number + "is" + calcFactorial(number));
    }
}
