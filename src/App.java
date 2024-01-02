import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imforme o Capital Inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.println("Imforme a taxa de Juros: ");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Informe o Tempo a ser investido: ");
        int tempo = scanner.nextInt();

        scanner.close();

        double total = calcularJurosCompostos(capitalInicial, taxaJuros, tempo);

        System.out.println("Total: " + total);
    }

        public static double calcularJurosCompostos(double capitalInicial, double taxaJuros, int tempo){
            double taxaDecimal = taxaJuros / 100.0;

            double total = capitalInicial * Math.pow((1 + taxaDecimal), tempo);

            return total;
        }
    }

