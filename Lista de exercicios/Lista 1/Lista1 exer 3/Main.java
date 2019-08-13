import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int num, bin;

    System.out.println("Escreva um número:\n");
    num = x.nextInt();

    System.out.println("Valor convertido  " + Integer.toBinaryString(num)); 

  }
}