
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр.

class Answer {
    public int sumDigits(int n) {
    // Введите свое решение ниже
        int sum=0;
        while (n!=0) {
            sum = sum+(n % 10);
            n/=10;   
        }
        return sum;
    }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
    public static void main(String[] args) {
    int n = 123456;
    if (args.length > 0) {
    n = Integer.parseInt(args[0]);
    }
    // Вывод результата на экран
    Answer ans = new Answer();
    int itresume_res = ans.sumDigits(n);
    System.out.println(itresume_res);
    }
    }
    