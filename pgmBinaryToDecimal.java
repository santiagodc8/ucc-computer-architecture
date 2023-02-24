import java.util.Scanner;

public class pgmBinaryToDecimal{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num, residuo,c=0,decimal=0;
        System.out.println("Escriba un numero binario: ");
        num = obj.nextInt();

        //proceso
        while(num!=0){
            residuo=num%10;
            decimal+=residuo*Math.pow(2, c);
            c++;
            num/=10;
        }
        System.out.println("El numero convertido a decimal es: " + decimal);
    }
}