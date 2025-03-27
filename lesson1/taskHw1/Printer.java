// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

class Answer {
    public int factorial(int n) {
    // Введите свое решение ниже
    if (n<0){
        return -1;
    }
    if (n==1){
        return n;
    }
    return n * factorial(n-1);
    }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
    public static void main(String[] args) {
    int n = 5;
    if (args.length > 0) {
    n = Integer.parseInt(args[0]);
    }
    // Вывод результата на экран
    Answer ans = new Answer();
    int itresume_res = ans.factorial(n);
    System.out.println(itresume_res);
    }
    }
    