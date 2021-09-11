import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1014 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer travelledDistance = Integer.valueOf(leitor.readLine());
        Double spentFuel  = Double.valueOf(leitor.readLine());
        System.out.printf("%.3f km/l\n", travelledDistance/spentFuel);
    }
}
