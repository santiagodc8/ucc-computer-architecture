import java.util.Scanner;

public class pgmDecimalToBinary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numero, residuo, binario = 0, exp = 0;
        System.out.println("Escriba un numero entero : ");
        numero = obj.nextInt();

        // proceso
        while (numero != 0) {
            residuo = numero % 2;
            binario += residuo * Math.pow(10, exp);
            exp++;
            numero /= 2;
        }
        System.out.println("El numero convertido a Binario es: " + binario);

    }
}