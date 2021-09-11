import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1013 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer larger = Integer.MIN_VALUE;
        final String[] numbers = leitor.readLine().split(" ");
        for (int i = 0; i < numbers.length; i++) {
            Integer atualNumber = Integer.valueOf(numbers[i]);
            if (larger < atualNumber) {
                larger = atualNumber;
            }
        }
        System.out.printf("%d eh o maior\n", larger);
    }
}
