// Напишите метод, который принимает целочисленный массив и возвращает
// новый массив, содержащий только уникальные элементы из исходного
// массива
import java.util.Arrays;
import java.util.LinkedHashSet;
class UniqueElements {
public static int[] getUniqueElements(int[] a) {
// Напишите свое решение ниже
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    for(int i: a){
        linkedHashSet.add(i);
    }
    
    Object[] obj1 = linkedHashSet.toArray();
    int [] arr1 = new int [obj1.length];
    for (int j=0;j<arr1.length;j++) {
        arr1[j] = (int) obj1[j];
    }
    return arr1;
}
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
public static void main(String[] args) {
int[] a;
if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
a = new int[]{1, 2, 2, 3, 4, 4, 5};
} else {
a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
}
UniqueElements answer = new UniqueElements();
String itresume_res = Arrays.toString(answer.getUniqueElements(a));
System.out.println(itresume_res);
}
}