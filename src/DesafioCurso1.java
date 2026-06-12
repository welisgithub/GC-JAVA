import java.util.Scanner;

/*
Inicializar os dados do cliente, menu de opções, consultar saldo, receber e sacar;
1 - Consultar saldo;
2 - Saquar dinheiro;
3 - Depositar dinheiro;
4 - Encerrar atendimento;
* */
public class DesafioCurso1 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String nome = "Welisson Andrade";
        String tipoDeConta = "Corrente";
        double saldo = 2000.00;
        int resposta = 0;
        double sacar = 0;
        double depositar = 0;

        System.out.println("*******************************************");
        System.out.println("Bem vindo! Segue as informações do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("*******************************************");

        while (resposta != 4) {
            System.out.println(" ");
            System.out.println("*******************************************");
            System.out.println("O que deseja fazer?");
            System.out.println("""
                    1 - Consultar Saldo Atual;
                    2 - Sacar;
                    3 - Depositar; 
                    4 - Encerrar atendimento;
                    
                    """);
            resposta = l.nextInt();

            switch (resposta) {
                case (1):
                    System.out.println("Saldo atual de R$" + saldo);
                    break;
                case(2):
                    System.out.println("Quanto você deseja sacar?");
                    sacar = l.nextDouble();
                    if (sacar > saldo){
                        System.out.println("Saldo insuficiente.");
                        break;
                    }else {
                        saldo -= sacar;
                        System.out.println("Saldo restante de R$" + saldo);
                        break;
                    }
                case(3):
                    System.out.println("Quanto você deseja depositar?");
                    depositar = l.nextDouble();
                    saldo += depositar;
                    System.out.println("Saldo restante de R$" + saldo);
                    break;
                case(4):
                    System.out.println("Atendimento encerrado.");
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    }
}
