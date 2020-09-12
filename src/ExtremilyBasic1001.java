import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtremilyBasic1001 {

    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        final Integer a = Integer.valueOf(leitor.readLine());
        final Integer b = Integer.valueOf(leitor.readLine());
        System.out.printf("X = %d\n", a + b);
    }
}
