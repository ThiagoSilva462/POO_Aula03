package view;
import model.*;

public class Contas {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("João", 123456, 1000, 10);
        ContaEspecial contaEspecial = new ContaEspecial("Maria", 789012, 2000, 500);

        contaPoupanca.depositar(500);
        contaPoupanca.sacar(200);
        contaPoupanca.calcularNovoSaldo(0.5f);

        contaEspecial.depositar(1000);
        contaEspecial.sacar(1500);
        contaEspecial.sacar(3000);

        System.out.println("Dados da Conta Poupança:");
        System.out.println("Cliente: " + contaPoupanca.getCliente());
        System.out.println("Número da conta: " + contaPoupanca.getNum_conta());
        System.out.println("Saldo: R$" + contaPoupanca.getSaldo());
        
        System.out.println("\nDados da Conta Especial:");
        System.out.println("Cliente: " + contaEspecial.getCliente());
        System.out.println("Número da conta: " + contaEspecial.getNum_conta());
        System.out.println("Saldo: R$" + contaEspecial.getSaldo());
        System.out.println("Limite: R$" + contaEspecial.getLimite());
    }
}