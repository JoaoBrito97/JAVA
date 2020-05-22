package entidades;

public class Banco {

    private int conta;
    private String nome;
    private double deposito;

    public Banco(int conta, String nome, double deposito){
        this.conta = conta;
        this.nome = nome;
        this.deposito = deposito;
    }

    public Banco(int conta, String nome){
        this.conta = conta;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getConta(){
        return conta;
    }

    public void setConta(int conta){
        this.conta = conta;
    }

    public double getDeposito(){
        return deposito;
    }

    public void addDeposito(double deposito){
        this.deposito += deposito;
    }

    public void saqueDeposito(double deposito){
        this.deposito -= deposito + 5.00;


    }

    public String toString(){
        return "USUÁRIO: "+conta+", "+nome.toUpperCase()+", R$"+String.format("%.2f", deposito);
    }
}
