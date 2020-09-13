import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeInDays1020 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer ageInDays = Integer.valueOf(leitor.readLine());
        Integer years = ageInDays / 365;
        ageInDays = ageInDays % 365;

        Integer months = ageInDays / 30;
        ageInDays = ageInDays % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",years, months, ageInDays);
    }
}
