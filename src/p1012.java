import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1012 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        final String[] numbers = leitor.readLine().split(" ");
        final Double a = Double.valueOf(numbers[0]);
        final Double b = Double.valueOf(numbers[1]);
        final Double c = Double.valueOf(numbers[2]);
        final Double triangle = (a * c) / 2.0;
        final Double circle = 3.14159 * Math.pow(c, 2.0);
        final Double trapezium = ((a + b) * c) / 2.0;
        final Double square = Math.pow(b, 2.0);
        final Double rectangle = a * b;
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",
                triangle, circle, trapezium, square, rectangle);
    }
}
