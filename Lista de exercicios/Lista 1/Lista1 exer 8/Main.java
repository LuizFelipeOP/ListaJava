import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int num, i;
    String check = "";
    System.out.println("Digite um numero:\n");
    num = x.nextInt();

      for(i = 2; i <= num ; i++){
        if((num % i == 0) && (num != i)){
          check = "não";
        }
      }
      System.out.println("Logo "+ num +" "+ check + " é um número primo");  
    }
  }
