//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Projeto Screen Match ");

        System.out.println("Filme: Top Gun - Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.9;

        //Média calculada nas 3 notas;
        double media = (9.9 + 6.3 + 8.1) / 3;
        System.out.println("Nota média: " + media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com Tom Cruise
                Ano de lançamento em
                """ + anoDeLancamento;
        System.out.println(sinopse);

        //Convertendo valores
        int classificacao;
        classificacao = (int) (media/2);
        System.out.println("Classificação de " + classificacao);

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}