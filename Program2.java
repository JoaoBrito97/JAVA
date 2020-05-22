package app;

import entidades.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("CONTA: ");
        int conta = sc.nextInt();
        System.out.print("NOME: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("DESEJA INICIAR O DEPÓSITO AGORA [S/N]: ");
        char opcao = sc.next().charAt(0);
        Banco banco;
        double deposito;
        if (opcao == 'S' || opcao == 's'){
            System.out.print("DEPÓSITO INICIAL: ");
            deposito = sc.nextDouble();
            banco = new Banco(conta, nome, deposito);
            System.out.println();
            System.out.println(banco);

        }else{
            banco = new Banco(conta, nome);
            System.out.println();
            System.out.println(banco);
        }
        System.out.println();
        System.out.print("DEPOSITAR: ");
        deposito = sc.nextDouble();
        banco.addDeposito(deposito);
        System.out.println(banco);
        System.out.println();
        System.out.print("SACAR: ");
        deposito = sc.nextDouble();
        banco.saqueDeposito(deposito);
        System.out.println(banco);

    }

}
