import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryWithBonus1009 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        leitor.readLine();
        final Double fixedSalary = Double.valueOf(leitor.readLine());
        final Double salesValue = Double.valueOf(leitor.readLine());
        final Double salary = fixedSalary + (salesValue * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", salary);
    }
}
