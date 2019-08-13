import java.util.*;
import java.util.function.Function;

public class Main {
  
    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    private static boolean check(int[] arr, int valor){ 
      for (int element : arr) { 
          if (element == valor) { 
              return true; 
          } 
      }
      return false;
 
    } 

    public static void main(String[] args) {   
    Scanner x = new Scanner(System.in);
    int[] fibVal = new int[20];
    int num;

    System.out.print("digite um numerpo: \n");
    num = x.nextInt();

    for (int i = 0; i < 20; i++) {
        fibVal[i] = (Main.fibo(i));
        }
    boolean y = Main.check(fibVal, num);
    if(y){
      System.out.print("esta dentro da sequencia");
    }else{
      System.out.print("nao esta dentro da sequencia");
    }
    }
  
}