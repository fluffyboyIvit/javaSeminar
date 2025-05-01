//Напишите метод, который принимает массив целых чисел и возвращает
// среднее значение элементов массива, округленное до ближайшего целого
// числа.

import java.util.Arrays;

class AverageCalculator {
    public static int calculateAverage(int[] a) {
    // Напишите свое решение ниже
    int sum = 0;
    for(int j=0;j< a.length;j++){
        sum += a[j];
    }
    int result = (int) Math.round((double)sum/a.length);
    return result;
    }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
    public static void main(String[] args) {
    int[] a;
    if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать эти параметры
    a = new int[]{4, 2, 7, 5, 1};
    } else {
    a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();}
    AverageCalculator answer = new AverageCalculator();
    int result = answer.calculateAverage(a);
    System.out.println(result);
    }
    }