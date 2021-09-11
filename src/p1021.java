import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1021 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer[] notesAndCoins = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        Integer[] numberOfNotesAndCoins = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Double value = Double.valueOf(leitor.readLine()) * 100.00;
        Integer valueInInteger = value.intValue();

        for (int i = 0; i < notesAndCoins.length; i++) {
            while (valueInInteger >= notesAndCoins[i]) {
                numberOfNotesAndCoins[i]++;
                valueInInteger-=notesAndCoins[i];
            }
        }


        System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n" +
                        "%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\nMOEDAS:\n" +
                        "%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n" +
                        "%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n",
                numberOfNotesAndCoins[0], numberOfNotesAndCoins[1], numberOfNotesAndCoins[2], numberOfNotesAndCoins[3],
                numberOfNotesAndCoins[4], numberOfNotesAndCoins[5], numberOfNotesAndCoins[6], numberOfNotesAndCoins[7],
                numberOfNotesAndCoins[8], numberOfNotesAndCoins[9], numberOfNotesAndCoins[10], numberOfNotesAndCoins[11]);
    }
}
