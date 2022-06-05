package JogoDaVelha;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class JogoDaVelha {
   public static void main(String[] args){
   
    Campo[][] velha=new Campo[4][4];
    char símboloAtual='X';
    Boolean game=true;
    String vitória="";
    Scanner scan=new Scanner(System.in);

    iniciarJogo(velha);

    while(game){
       desenhaJogo(velha);
       vitória=verificaVitória(velha);
       if(!vitória.equals("")){
          System.out.printf("Jogador %s venceu%n",vitória);
          break;
       }

       try{
          if(verificarJogada(velha,jogar(scan, símboloAtual),símboloAtual)){
             if(símboloAtual=='X'){
                símboloAtual='O';
             }else{
               símboloAtual='X';
             }

          }


       }catch(Exception e){
          System.out.printf("Erro");
       }

    }
    System.out.printf("Fim do Jogo");

   }

   public static void desenhaJogo(Campo[][] velha){
       //limparTela
       System.out.println("       1      2      3");
       System.out.printf("1   %c  |  %c  |  %c  %n",velha[1][1].getSímbolo(),velha[1][2].getSímbolo(),velha[1][3].getSímbolo());
       System.out.println("      ------------------");
       System.out.printf("2   %c  |  %c  |  %c  %n",velha[2][1].getSímbolo(),velha[2][2].getSímbolo(),velha[2][3].getSímbolo());
       System.out.println("      ------------------");
       System.out.printf("3   %c  |  %c  |  %c  %n",velha[3][1].getSímbolo(),velha[3][2].getSímbolo(),velha[3][3].getSímbolo());
   }

   public static void limparTela() {
      for(int cont=0;cont<200;cont++);
      System.out.println("");
   }

   public static int[] jogar(Scanner scan,char símboloAtual){
      int[] p=new int[3];
      System.out.printf("%s %c%n","Quem Joga: ",símboloAtual);
   System.out.print("Informe a linha: ");
   p[0]=scan.nextInt();
   System.out.print("Informe a coluna: ");
   p[1]=scan.nextInt();
   return p;


   }

   public static Boolean verificarJogada(Campo[][] velha, int p[],char símboloAtual){
      if(velha[p[1]][p[2]].getSímbolo()==' '){
         velha[p[1]][p[2]].setSímbolo(símboloAtual);
         return true;

      }else{
         return false;
      }

      

      
   }

   public static void iniciarJogo(Campo[][] velha){
      for(int linha=1;linha<4;linha++){
         for(int coluna=1;coluna<4;coluna++){
            velha[1][coluna]=new Campo();
         }

      }

   }



   public static String verificaVitória(Campo[][] velha) {
      return " ";
      
   }
}
