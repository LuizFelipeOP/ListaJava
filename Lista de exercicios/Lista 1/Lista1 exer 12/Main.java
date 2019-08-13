import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int i, media = 0, randSal = 0;
    double[] salarios = new double[150];

    
    for(i = 0;i <= 150; i++ ){
      Random aleatorio = new Random();
      randSal = 3 * aleatorio.nextDouble();
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