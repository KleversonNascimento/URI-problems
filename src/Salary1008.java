import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary1008 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        final Integer numberOfEmployee = Integer.valueOf(leitor.readLine());
        final Integer workedHours = Integer.valueOf(leitor.readLine());
        final Double hourlyValue = Double.valueOf(leitor.readLine());
        final Double salary = workedHours * hourlyValue;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numberOfEmployee, salary);
    }
}
