// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.

import java.util.ArrayList;
import java.util.Arrays;

class FilterNegative {
public static int[] filterNegative(int[] a) {
// Напишите свое решение ниже
// через массивы и счетчики:
    // int count = 0;
    // for (int i: a){
    //     if (i>=0) count +=1;
    // }
    //  int [] arr1 = new int [count];
    //  int count2 = 0;
    // for (int j=0;j<a.length;j++)
    // {
    //     if (a[j]>=0) {
    //         arr1[count2] = a[j];
    //         count2++;
    //     }
    // }
// через arraylist:
    ArrayList <Integer> list = new ArrayList<> ();
    for(int i:a){
        if (i>=0) {
            list.add(i);
        }
    }
    int [] arr1 = new int [list.size()];
    for(int i = 0;i<list.size();i++)
    {
        arr1[i] = list.get(i);
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
a = new int[]{-1, 2, -3, 4, -5, 6};
} else {
a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
}
FilterNegative answer = new FilterNegative();
String itresume_res = Arrays.toString(answer.filterNegative(a));
System.out.println(itresume_res);
}
}