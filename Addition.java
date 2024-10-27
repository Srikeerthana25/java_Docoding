public class Addition{
 public int add(int x, int y){
 return x + y;
 }

 public static void main(String[] args){
  Addition plus = new Addition();
  int ans = plus.add( 12 , 13);
  System.out.println("the value is = " + ans);
 }
}
