
class Main {
  static int matrículaA = 15;
  static double Prova1A = 8;
  static double Prova2A = 1;
  static double TrabsA = 10;
  static String nomeA = new String("Irinel");
  
  public static double Media(double prova1,double prova2, double trab) {
    double media = ((prova1 * 2) + (prova2 * 2) + (trab * 2.5))/6.5;
    return media;
  }

  public static int Final(double notas){
    if(notas < 4) return 0;

  return 1;
  }

  public static void main(String[] args) {
    double notas = Media(Prova1A, Prova2A, TrabsA);
    
    int x = Final(notas);
     if(x == 0){
        System.out.println("Aluno reprovado com " + notas);
     }else{
        System.out.println("Aluno apto para fazer a prova final, com média atual " + notas);
     }
  }
}