import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1019 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Integer timeInSeconds = Integer.valueOf(leitor.readLine());
        Integer hours = timeInSeconds / 3600;
        timeInSeconds = timeInSeconds % 3600;

        Integer minutes = timeInSeconds / 60;
        timeInSeconds = timeInSeconds % 60;


        System.out.printf("%d:%d:%d\n",hours, minutes, timeInSeconds);
    }
}
