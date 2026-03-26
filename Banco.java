import java.util.Scanner;
public class Banco{
    static double saldo = 1000;
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        while ( opcao !=4){
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Deposito");
            System.out.println("3 - Saque");
            System.out.println("4 - Sair");

            System.out.println("Escolha");
            opcao = leitor.nextInt();

            if(opcao == 1){
                verSaldo();
            } else if (opcao == 2){
                depositar(leitor);
            } else if(opcao == 3){
                sacar(leitor);
            } else if(opcao == 4){
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção invalida");
            }
        } leitor.close();
    }
    public static void verSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
    public static void depositar(Scanner leitor) {
        System.out.println("Quanto deseja depositar?");
        double valor = leitor.nextDouble();

        saldo += valor;

        System.out.println("Novo saldo: R$" + saldo);
    }
    public static void sacar(Scanner leitor) {
        System.out.println("Quanto deseja sacar?");
        double valor = leitor.nextDouble();

        if(valor <= saldo) {
            saldo -=valor;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}