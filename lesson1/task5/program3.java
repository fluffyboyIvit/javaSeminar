import java.lang.Math;
import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первую переменную: ");
        int a =  iScanner.nextInt();
        System.out.print("Введите вторую переменную: ");;
        int b =  iScanner.nextInt();
        double c = Math.pow(a, b);
        System.out.println(c);
    }
}