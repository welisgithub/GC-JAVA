import java.util.Random;
import java.util.Scanner;

/* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa
 deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
* */
public class Atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroEscolhido = 0;

        while (tentativas < 5){
            System.out.println("Adivinhe o numero: ");
            numeroEscolhido = leitor.nextInt();
            if (numeroEscolhido == numeroGerado){
                System.out.println("Parabéns! Você acertou!");
                tentativas = 5;
            }else if (numeroEscolhido > numeroGerado){
                System.out.println("Errou... O número é menor que o escolhido.");
                tentativas++;
            }else{
                System.out.println("Errou... O número é maior que o escolhido.");
                tentativas++;
            }
        }
        if (tentativas == 5 && numeroEscolhido != numeroGerado){
            System.out.println("O número gerado foi: " + numeroGerado);
        }
    }
}
