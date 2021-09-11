import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1018 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer value = Integer.valueOf(leitor.readLine());
        System.out.println(value);
        Integer bankNotes100 = value / 100;
        value = value % 100;

        Integer bankNotes50 = value / 50;
        value = value % 50;

        Integer bankNotes20 = value / 20;
        value = value % 20;

        Integer bankNotes10 = value / 10;
        value = value % 10;

        Integer bankNotes5 = value / 5;
        value = value % 5;

        Integer bankNotes2 = value / 2;
        value = value % 2;

        Integer bankNotes1 = value / 1;
        value = value % 1;

        System.out.printf("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n" +
                "%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n",
                bankNotes100, bankNotes50, bankNotes20, bankNotes10, bankNotes5, bankNotes2, bankNotes1);
    }
}
