package application;
import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int qtd,remove;
        //Products é a classe e produto é varivel criada nessa classe Program
        Products produto = new Products() ;
        System.out.print("NOME: ");
        produto.nome = leia.nextLine();
        System.out.print("PREÇO: ");
        produto.preco = leia.nextDouble();
        System.out.print("QUANTIDADE: ");
        produto.quatidade = leia.nextInt();
        System.out.println();
        System.out.println("PRODUTO DATA: "+produto);
        System.out.println();
        System.out.println("ENTRE COM O NÚMERO DO PRODUTO PARA ADD NO ESTOQUE: ");
        qtd = leia.nextInt();
        produto.addProtucts(qtd);
        System.out.println();
        System.out.println("ATUALIZAÇÃO DO ESTOQUE "+produto);
        System.out.println();
        System.out.println("ENTRE COM O NÚMERO DO PRODUTO PARA REMOVER DO ESTOQUE: ");
        remove = leia.nextInt();
        produto.revomeProdutcs(remove);
        System.out.println("ATUALIZAÇÃO DO ESTOQUE "+produto);

        leia.close();



    }

}
