import java.util.Scanner;
import java.util.logging.Logger;

public class program {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("main");
        logger.info("введите общую кучу: ");
        String str1 = iScanner.next();
        if(str1.length()==0) throw new Exception("Введена пустая строка!");
        logger.info("Введите интересующие вас символы: ");
        String str2 = iScanner.next();
        if(str2.length()==0) throw new Exception("Введена пустая строка!");
        StringBuilder sb = new StringBuilder();
        int count;
        sb.toString();
        for(char c2: str2.toCharArray())
            {
                count = 0;
            for (char c1 : str1.toCharArray()) {
                if (c2 == c1) count++;
            }
            sb.append(c2)
                .append(":")
                .append(count)
                .append(" ");
        }
        logger.info(sb.toString());
     
    }
}