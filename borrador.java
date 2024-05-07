import java.util.Scanner;

public class borrador {
    public static void main(String[] args) {
        int mayor = -99999999;
        Scanner scanner = new Scanner(System.in);
        int valor = 0;

        while (valor != -1) {
            valor = scanner.nextInt();
            if (valor > mayor) {
                mayor = valor;
            }
        }

        System.out.println(mayor);

    }
}
