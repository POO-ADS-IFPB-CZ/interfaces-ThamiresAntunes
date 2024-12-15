package model;

//primeiro extende a classePai e depois implementa as interfaces na classe
public class ContaPoupanca extends Conta implements Investimento{

    public ContaPoupanca(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Poupança.");
    }
    @Override
    public void reajustar(double taxa) {
        double percentual = taxa / 100;
        double saldoReajustado = getSaldo() + (getSaldo() * percentual);
        setSaldo(saldoReajustado);
        System.out.println("Saldo reajustado");
    }
}
