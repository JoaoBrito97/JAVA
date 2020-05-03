import java.util.Scanner;
import java.util.Locale;

class Exe11 {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    int qtd = 0,opcao;
    double valor = 0;
    System.out.println("1 - CACHORRO QUENTE ------ R$4.00");
    System.out.println("2 - X SALADA --------------R$4.50");
    System.out.println("3 - X BACON ---------------R$5.00");
    System.out.println("4 - TORRADA SIMPLES -------R$2.00");
    System.out.println("5 - REFRIGERANTE ----------R$2.50");
    opcao = leia.nextInt();
    System.out.print("QUANTOS? ");
    qtd = leia.nextInt();
    switch(opcao){
       case 1:
         if(qtd > 0){
            valor = qtd * 4.00;
            System.out.println("R$"+String.format("%.2f",valor));
         }else{
            System.out.println("R$4.00");
         }
       break;
       case 2:
         if(qtd > 0){
           valor = qtd * 4.50;
           System.out.println("R$"+String.format("%.2f",valor));
         }else{
           System.out.println("R$4.50");
         }
       break;
       case 3:
         if(qtd > 0){
           valor = qtd * 5.00;
           System.out.println("R$"+String.format("%.2f",valor));
         }else{
           System.out.println("R$5.00");
         }
       break;
       case 4:
          if(qtd > 0){
            valor = qtd * 2.00;
            System.out.println("R$"+String.format("%.2f",valor));
          }else{
            System.out.println("R$2.00");
          }
       break;
       case 5:
         if(qtd>0){
           valor = qtd * 2.50;
           System.out.println("R$"+String.format("%.2f",valor));
         }else{
           System.out.println("R$2.50");
         }
       break;
       default:
          System.out.println("OPÇÃO INVÁLIDA!");
          break;
    
    }
  }
}
