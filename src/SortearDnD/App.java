package SortearDnD;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws DadoInvalidoException {
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite a quantidadede lados: ");
        int lados = ler.nextInt();
        System.out.println("Digite a quantidadede de vezes: ");
        int vezes = ler.nextInt();

        Dado dado = new Dado(lados);
        Sorteador sorteador = new Sorteador(dado);
        Resultado resultado = sorteador.sortear(vezes);

        System.out.println(resultado.getNumeros());
        System.out.println(resultado.getSoma());
    }

}
