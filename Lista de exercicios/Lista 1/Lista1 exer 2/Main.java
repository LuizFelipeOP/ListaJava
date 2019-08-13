import java.util.*;

class Main {
  public static void main(String[] args) {
  Scanner x = new Scanner(System.in);

    ArrayList nome = new ArrayList();
    ArrayList salario = new ArrayList();
    ArrayList salarioR = new ArrayList();
    String NomeReader;
    double SalarioReader;
  do{

    System.out.printf("Informe o nome:\n");
    NomeReader = x.next();
    nome.add(NomeReader);
    if(!(NomeReader.equals("fim"))){
      
      System.out.printf("Informe o salário:\n");
      SalarioReader = x.nextDouble();
      salario.add(SalarioReader);
      
      if(SalarioReader < 0){
        System.out.printf(" ¯\\_(ツ)_/¯\n");
      }else if(SalarioReader <= 150){
        salarioR.add(SalarioReader + (SalarioReader * 0.25));
      }else if(SalarioReader <= 300){
        salarioR.add(SalarioReader + (SalarioReader * 0.20));
      }else if(SalarioReader <= 600){
        salarioR.add(SalarioReader + (SalarioReader * 0.15));
      }else if(SalarioReader > 600){
        salarioR.add(SalarioReader + (SalarioReader * 0.10));
      }
    }
    
  }while(!(NomeReader.equals("fim")));

    
    
    System.out.printf("O salário é: " + salarioR);
        
  }
}