package app;

import entidades.Conversor;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("COTAÇÃO DO DOLLAR: ");
        double cotacao = sc.nextDouble();
        System.out.print("VAI COMPRAR QUANTOS DOLLARES: ");
        double dollares = sc.nextDouble();
        System.out.println("VOCÊ PAGAR VAI PARA EM R$"+String.format("%.2f", Conversor.convertReal(cotacao, dollares)));
        sc.close();

    }
}
