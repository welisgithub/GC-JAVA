public class Conditional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.9;
        String tipoDoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Este filme é um lançamento!");
        }else {
            System.out.println("Este é um filme retrô!");
        }

        if (incluidoNoPlano == true && tipoDoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        }else{
            System.out.println("Deve assinar o plano!");
        }
    }
}
