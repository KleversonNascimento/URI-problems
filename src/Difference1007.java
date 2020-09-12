import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Difference1007 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        final Integer a = Integer.valueOf(leitor.readLine());
        final Integer b = Integer.valueOf(leitor.readLine());
        final Integer c = Integer.valueOf(leitor.readLine());
        final Integer d = Integer.valueOf(leitor.readLine());
        final Integer result = (a * b) - (c * d);
        System.out.printf("DIFERENCA = %d\n", result);
    }
}
