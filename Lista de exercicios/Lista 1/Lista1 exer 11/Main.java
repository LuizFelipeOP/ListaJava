import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int func, i, media = 0, randSal = 0;

    System.out.println("Quantos funcionarios tem na empresa?\n");
    func = x.nextInt();
    int[] salarios = new int[func];
    
    for(i = 0;i < func; i++ ){
      Random aleatorio = new Random();
      randSal = aleatorio.nextInt(8000) + 1000;
      media = media + randSal;
      salarios[i] = randSal;
      
    }
    media = media / func;
  System.out.println("Os salarios acima da media são: \n");

    for(i = 0;i < func; i++ ){
      if(salarios[i] > media){
        System.out.println( salarios[i] + "\n");
      }
      
      
    }
  }
}