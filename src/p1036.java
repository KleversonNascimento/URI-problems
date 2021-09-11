import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1036 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        String numbersInString = leitor.readLine();
        String[] numbersInStringSplitted = numbersInString.split(" ");
        Double a = Double.valueOf(numbersInStringSplitted[0]);
        Double b = Double.valueOf(numbersInStringSplitted[1]);
        Double c = Double.valueOf(numbersInStringSplitted[2]);

        Double delta = Math.pow(b, 2.0) - (4.0 * a * c);

        if (delta <= 0.00 || a == 0.00) {
            System.out.printf("Impossivel calcular\n");
            return;
        }

        Double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        Double r2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
    }
}
