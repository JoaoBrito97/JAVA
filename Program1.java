package app;

import entidades.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Produtos produtos;
        System.out.print("NOME DO PRODUTO: ");
        String nome = sc.nextLine();
        System.out.print("PREÇO DO PRODUTO: ");
        double preco = sc.nextDouble();
        System.out.print("QUANTIDADE: ");
        int quantidade = sc.nextInt();
        produtos = new Produtos(nome, preco, quantidade);
        System.out.println("ATUALIZADO: "+produtos);
        System.out.print("ADICIONAR NO ESTOUE: ");
        quantidade = sc.nextInt();
        produtos.addEstoque(quantidade);
        System.out.println("ATUALIZADO: "+produtos);
        System.out.print("REMOVER DO ESTOQUE: ");
        quantidade = sc.nextInt();
        produtos.removeEstoque(quantidade);
        System.out.println("ATUALIZADO: "+produtos);
        sc.close();

    }
}
