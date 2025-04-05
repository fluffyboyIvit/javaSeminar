// Реализуйте метод поиска минимального и максимального элементов массива.
// После нахождения каждого элемента (минимального и максимального),
// сделайте запись в лог-файл log.txt в формате год-месяц-день
// час:минуты {минимальный элемент}, {максимальный элемент}.



import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
class ArrayOperations {
private static File log;
private static FileWriter fileWriter;
public static void findMinMax(int[] arr) {
// Реализуйте метод для поиска минимального и максимального элемента
try { 
    log = new File("log.txt");
    log.createNewFile();
    fileWriter = new FileWriter(log);

int max = arr[0];
int min = arr[0];
for(int i = 0; i<=arr.length-1;i++)
{
    if (arr[i]>max) {
        max = arr[i];  
    }
    if (arr[i]<min){
        min = arr[i];
    }
}
logStep(min, max);
} catch(IOException e){
    e.printStackTrace();

}
finally{
    try{
        fileWriter.close();
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
}
private static void logStep(int min, int max) {
// Реализуйте метод для записи состояния в лог-файл
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String timestep = dateFormat.format(new Date());
        fileWriter.write(timestep+ " "+ min +", "+ max+ "\n");
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
public static void main(String[] args) {
    int[] arr = {};
    // При отправке кода на Выполнение, вы можете варьировать эти параметры
    if (args.length == 0) {
    arr = new int[]{9, 4, 8, 3, 1};
    } else {
    arr = Arrays.stream(args[0].split(", "))
    .mapToInt(Integer::parseInt)
    .toArray();
    }
    ArrayOperations ans = new ArrayOperations();
    ans.findMinMax(arr);
    try (BufferedReader br = new BufferedReader(new
    FileReader("log.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
    System.out.println(line);
    }
    } catch (IOException e) {
    e.printStackTrace();
    }
}
}