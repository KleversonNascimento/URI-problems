import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenTwoPoints1015 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = leitor.readLine().split(" ");
        Double x1 = Double.valueOf(numbers[0]);
        Double y1 = Double.valueOf(numbers[1]);
        numbers = leitor.readLine().split(" ");
        Double x2 = Double.valueOf(numbers[0]);
        Double y2 = Double.valueOf(numbers[1]);
        System.out.printf("%.4f\n", Math.sqrt((Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0))));
    }
}
