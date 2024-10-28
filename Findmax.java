public class Findmax {
    public static int findmax(int a, int b ,int c){
       return (Math.max(a, (Math.max(b,c))));
    }

    public static void main(String[] args) {
        int num1=25, num2=67, num3=99;
        System.out.println("the max num is" + findmax(num1,num2,num3));
    }
}
