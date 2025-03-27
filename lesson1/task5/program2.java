//способ рекурсия
import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первую переменную: ");
        int a =  iScanner.nextInt();
        System.out.print("Введите вторую переменную: ");;
        int b =  iScanner.nextInt();
        int c = pow(a,b);
        System.out.println(c);


    }
    public static int pow(int a, int b){
        if (b == 1){
            return a;
        }else{
            return a * pow(a,b-1);
        }
    }
}