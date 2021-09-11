import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1006 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        final Double a = Double.valueOf(leitor.readLine());
        final Double b = Double.valueOf(leitor.readLine());
        final Double c = Double.valueOf(leitor.readLine());
        final Double result = ((a * 2.0) + (b * 3.0) + (c * 5.0))/10.0;
        System.out.printf("MEDIA = %.1f\n", result);
    }
}