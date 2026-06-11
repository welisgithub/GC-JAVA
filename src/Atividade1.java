public class Atividade1 {
    public static void main(String[] args) {
        //Atividade pratica aula 2 "constuindo catalogos de filmes":
        /* Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
        Utilize variáveis para representar os valores das temperaturas e imprima no console o
        valor convertido de Celsius para Fahrenheit.
        * */
        System.out.println("Atividade pratica aula 2: Conversão de temperatura!");
        double temperaturaEmCelcius = 30.2;
        double temperaturaEmFahrenheit = (temperaturaEmCelcius * 1.8) + 32;

        System.out.println("A temperatura em graus Celsius é de " + temperaturaEmCelcius + "C°");
        String mensagem = String.format("A temperatura equivalente em Fahrenheit é de %.2f", temperaturaEmFahrenheit);
        System.out.println(mensagem);

        int temperaturaInteiraEmFahrenheit = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é de " + temperaturaInteiraEmFahrenheit);
    }
}
