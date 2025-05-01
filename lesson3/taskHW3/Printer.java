// Реализуйте метод, который принимает на вход массив строк и возвращает
// новый массив, содержащий только строки, длина которых больше 3 символов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
class FilterStrings {
public static String[] filterShortStrings(String[] arr) {
// Напишите свое решение ниже
    ArrayList<String> arrayList = new ArrayList<>();
    for(String i:arr)
    {
        if(i.length()>3) arrayList.add(i);
    } 
    String[] arrStr = new String[arrayList.size()];
    for(int j =0;j<arrStr.length;j++){
        arrStr[j]=arrayList.get(j);
    }
    return arrStr;
}
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
public static void main(String[] args) {
String[] arr;
if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
arr = new String[]{"cat", "elephant", "dog", "giraffe"};
} else {
arr = args[0].split(", ");
}
FilterStrings answer = new FilterStrings();
String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
System.out.println(itresume_res);
}
}
