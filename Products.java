package entities;

public class Products {
    public String nome;
    public double preco;
    public int quatidade;

    public double totalValueInStock(){
        return preco * quatidade;
    }
    public void addProtucts(int quantidades){
        this.quatidade += quantidades;
    }
    public void revomeProdutcs(int quantidades){
        this.quatidade-= quantidades;
    }
    public String toString(){
        //esse método vai deixar o resultado formatado
        return nome + ", $"+String.format("%.2f",preco)
                +", "+quatidade
                +" unidade, total $"+String.format("%.2f",totalValueInStock());
    }

}
