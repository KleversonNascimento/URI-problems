import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interval1037 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Double value = Double.valueOf(leitor.readLine());

        if (value >= 0.00 && value <= 25.00) {
            System.out.printf("Intervalo [0,25]\n");
            return;
        }

        if (value > 25.00 && value <= 50.00) {
            System.out.printf("Intervalo (25,50]\n");
            return;
        }

        if (value > 50.00 && value <= 75.00) {
            System.out.printf("Intervalo (50,75]\n");
            return;
        }

        if (value > 75.00 && value <= 100.00) {
            System.out.printf("Intervalo (75,100]\n");
            return;
        }

        System.out.printf("Fora de intervalo\n");
    }
}
