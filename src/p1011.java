import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1011 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Double radius = Double.valueOf(leitor.readLine());
        Double volume = (4.0/3.0) * 3.14159 * Math.pow(radius, 3.0);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
