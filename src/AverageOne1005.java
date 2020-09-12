import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageOne1005 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        final Double a = Double.valueOf(leitor.readLine());
        final Double b = Double.valueOf(leitor.readLine());
        final Double result = ((a * 3.5) + (b * 7.5))/11.0;
        System.out.printf("MEDIA = %.5f\n", result);
    }
}
