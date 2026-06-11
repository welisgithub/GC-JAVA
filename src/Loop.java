import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliação = 0;
        double nota = 0;
        int numeroDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a sua nota para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliação += nota;
                numeroDeNotas++;
            }
        }
        System.out.println("A media das avaliações é de: " + mediaAvaliação/numeroDeNotas);
    }
}
