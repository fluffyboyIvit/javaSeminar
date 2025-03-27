import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первую переменную: ");
        int a =  iScanner.nextInt();
        System.out.print("Введите вторую переменную: ");;
        int b =  iScanner.nextInt();
        int result = 1;
        for(int i = 1; i<=b;i++){
            result = result * a;
        }
        System.out.println(result);
    }
}
