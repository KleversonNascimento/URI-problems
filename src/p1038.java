import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class p1038 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Double> options = new HashMap<>();
        options.put(1, 4.00);
        options.put(2, 4.5);
        options.put(3, 5.0);
        options.put(4, 2.0);
        options.put(5, 1.5);

        String input = leitor.readLine();
        Integer code = Integer.valueOf(input.split(" ")[0]);
        Integer quantity = Integer.valueOf(input.split(" ")[1]);

        System.out.printf("Total: R$ %.2f\n", options.get(code) * quantity);
    }
}
