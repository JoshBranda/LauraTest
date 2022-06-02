import java.util.Scanner;

public class Calculadora {
    
    public static void main(String [] args) {
        
        int n1;
        int n2;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Qual o primeiro número?");
            n1 = input.nextInt();
            System.out.println("Qual o segundo número?");
            n2 = input.nextInt();
            System.out.println("Soma = " + (n1 + n2));
            System.out.println("Subtração = " +(n1-n2));
            System.out.println("Multiplicação =" + (n1*n2));
            System.out.println("Divisão = " + (n1/n2));

        }


