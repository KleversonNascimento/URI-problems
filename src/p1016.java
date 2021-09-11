import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1016 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer distance = Integer.valueOf(leitor.readLine());
        System.out.printf("%d minutos\n", (distance * 60)/30);
    }
}
