import java.util.Scanner;
import java.util.logging.Logger;


public class program{
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("main");
        logger. info("введите исходную строку: ");
        String str = iScanner.next();
        if(str.length()==0) throw new Exception("Введена пустая строка!");
        char c;
        StringBuilder sb = new StringBuilder();
        c = str.charAt(0);
        sb.append(c);
        for (char item : str.toCharArray()) {
            if (c != item) sb.append(item);
            c = item;
            
        }
        logger.info(sb.toString());

        
    }
}