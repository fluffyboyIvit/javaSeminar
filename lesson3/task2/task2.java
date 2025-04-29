import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","2","b","3","c","4"));
        Task2 task2 = new Task2();
        task2.printResultOfCheck(list);
    }
    public static void printResultOfCheck(List<String> list){
        for (String s: list){
            try {
            int i =  Integer.valueOf(s);
            System.out.println(i + "  - число");  
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println(s + " - строка");
            }
            
        }
    }
}
