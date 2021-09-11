import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1035 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        String numbersInString = leitor.readLine();
        String[] numbersInStringSplitted = numbersInString.split(" ");
        Integer a = Integer.valueOf(numbersInStringSplitted[0]);
        Integer b = Integer.valueOf(numbersInStringSplitted[1]);
        Integer c = Integer.valueOf(numbersInStringSplitted[2]);
        Integer d = Integer.valueOf(numbersInStringSplitted[3]);

        Boolean accepted = true;

        if (b <= c) {
            accepted = false;
        }

        if (d <= a) {
            accepted = false;
        }

        if ((c + d) <= (a + b)) {
            accepted = false;
        }

        if (c < 0 && d < 0) {
            accepted = false;
        }

        if (a % 2 != 0) {
            accepted = false;
        }

        if (accepted) {
            System.out.printf("Valores aceitos\n");
        } else {
            System.out.printf("Valores nao aceitos\n");
        }
    }
}
