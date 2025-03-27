import java.util.Scanner;
import java.time.LocalDateTime;
public class program{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = iScanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.now();
        int hour = dateTime.getHour();
            if (5<=hour && hour<12){
            System.out.printf("доброе утро, %s!", name);
            }
            if (12<=hour && hour<18){
                System.out.printf("добрый день, %s!", name);
                }
            if (18<=hour && hour<23){
                System.out.printf("доброе вечер, %s!", name);
                }
            if (23<=hour && hour<4){
                System.out.printf("доброе ночи, %s!", name);
                }

}
}