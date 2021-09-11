import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1040 {
    public static void main(String[] args) throws IOException {
        final BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        String input = leitor.readLine();
        final Double a = Double.valueOf(input.split(" ")[0]);
        final Double b = Double.valueOf(input.split(" ")[1]);
        final Double c = Double.valueOf(input.split(" ")[2]);
        final Double d = Double.valueOf(input.split(" ")[3]);
        Double average = ((a * 2.0) + (b * 3.0) + (c * 4.0) + (d * 1.0))/10.0;
        Double extraExam = 0.0;
        if (average >= 5.0 & average < 7.0) {
            extraExam = Double.valueOf(leitor.readLine());
        }
        System.out.printf("Media: %.1f\n", average);
        if (average < 5.0) {
            System.out.printf("Aluno reprovado.\n");
            return;
        }
        if (average >= 7.0) {
            System.out.printf("Aluno aprovado.\n");
            return;
        }
        System.out.printf("Aluno em exame.\n");

        System.out.printf("Nota do exame: %.1f\n", extraExam);
        average = (average + extraExam) / 2.0;
        if (average >= 5.0) {
            System.out.printf("Aluno aprovado.\n");
        } else {
            System.out.printf("Aluno reprovado.\n");
        }
        System.out.printf("Media final: %.1f\n", average);

    }
}
