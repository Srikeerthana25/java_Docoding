public class Prime {
    public static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        for (int  i = 2; i <= Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 49;
        if (isprime(num)) {
            System.out.println( "is the num is not prime");
        }
        else {
            System.out.println( "is the num is prime");
        }
    }
}
