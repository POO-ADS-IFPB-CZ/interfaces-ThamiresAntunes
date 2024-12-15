import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca conta = new ContaPoupanca(3, "Maria", 2000);
        System.out.println("--Conta de " + conta.getNome() + " antes do reajuste--");
        System.out.println(conta.mostrarConta());

        //reajuste de 10% no saldo
        conta.reajustar(10);
        System.out.println("--Conta de " + conta.getNome() + " depois do reajuste--");
        System.out.println(conta.mostrarConta());

    }
}