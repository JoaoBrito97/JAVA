package app;

import entidades.Quartos;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //instanciando a Classe Quartos dentro de 1
        //vetor de 10 posições
        Quartos estudantes[] = new Quartos[10];

        System.out.print("QUANTOS ALUNOS: ");
        int alunos = sc.nextInt();

        for (int i = 1 ; i <= alunos; i++){
            sc.nextLine();
            System.out.println("QUARTO #"+i);
            System.out.print("NOME: ");
            String nome = sc.nextLine();
            System.out.print("E-MAIL: ");
            String email = sc.nextLine();
            System.out.print("QUARTO: ");
            int quarto = sc.nextInt();
            /*JOGUEI A VAR QUARTO DENTRO DO VETOR ESTUDANTES[] E ESTANCIE O CONTRUTOR DENTRO DO VETOR*/
            estudantes[quarto] = new Quartos(nome, email);
        }

        System.out.println();
        System.out.println("QUARTOS:");
        for (int i = 0; i < 10; i++){
            if(estudantes[i] != null){
                //estudantes[i], vai retornar o estudantes cadastrados
                //+i, vai retornar os quartos
                System.out.println(i+": "+estudantes[i]);
            }
        }
        sc.close();
    }

}
