import java.util.Scanner;
import java.util.logging.Logger;

public class program{
    static void PrintAltLenLines (String c1 ,String c2 ,int n){

        
        for(int i = 0;i < n; i++){
            
            if (i%2 == 0) System.out.print(c1);
           else  System.out.print(c2);
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        Logger logger = Logger.getLogger( "main");
        logger.info("введите значение c1");
        String c1 = iScanner.nextLine();
        logger.info("введите значение c2");
        String c2 = iScanner.nextLine();
        logger.info("введите длинну: ");
        int lengthN = iScanner.nextInt();
        if (lengthN<=0){
            throw  new Exception("валидное значение N");
        }
        PrintAltLenLines(c1,c2,lengthN);
        

        
    }
}