import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1017 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer timeSpent = Integer.valueOf(leitor.readLine());
        Integer averageSpeed = Integer.valueOf(leitor.readLine());
        Integer travelledDistance = timeSpent * averageSpeed;
        System.out.printf("%.3f\n", travelledDistance / 12.0);
    }
}
