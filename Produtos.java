package entidades;

public class Produtos {

    public String nome;
    public double dinheiro;
    public int quantidade;

    public Produtos(String nome, double dinheiro, int quantiade){
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.quantidade = quantiade;
    }

    public double totalEstoque(){
        return quantidade * dinheiro;
    }

    public void addEstoque(int estoque){
        this.quantidade += estoque;
    }

    public void removeEstoque(int estoque){
        this.quantidade -= estoque;
    }

    public String toString(){
        return nome.toUpperCase()+", "+quantidade+" unidades, total R$"+String.format("%.2f", totalEstoque());
    }
}
