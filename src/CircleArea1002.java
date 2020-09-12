import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class CircleArea1002 {

    public static void main(String[] args) throws IOException {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        final Double PI = 3.14159;
        final Double raio = Double.parseDouble(leitor.readLine());
        final Double resultado = PI * (raio * raio);
        System.out.printf("A=%.4f\n", resultado);
    }

}