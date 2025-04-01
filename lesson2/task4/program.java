import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите исходную строку: ");
        String str = iScanner.next();
        int [] array1 = new int[str.length()];
        for(int i = 0; i< str.length(); i++)
        {
            logger.info("Введите значение индекса массива: ");
            array1[i] = iScanner.nextInt();
        }
        char[] result = new char[str.length()];

        for(int i = 0; i < array1.length; i++){
            char temp = str.charAt(i);
            int tempIndex = array1[i];
            result[tempIndex -1] = temp;
        }
        logger.info(Arrays.toString(result));
        
    }
}
