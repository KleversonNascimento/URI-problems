import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculation1010 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Double totalAmount = 0.0;
        for (int i = 0; i < 2; i++) {
            String line = leitor.readLine();
            String[] infos = line.split(" ");
            Integer quantity = Integer.valueOf(infos[1]);
            Double value = Double.valueOf(infos[2]);
            totalAmount += quantity * value;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAmount);
    }
}
