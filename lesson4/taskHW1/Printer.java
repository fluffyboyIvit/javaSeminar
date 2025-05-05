// Дан LinkedList с несколькими элементами. В методе
// removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
// которых нечетная. Используйте LinkedList и стандартные методы.

import java.util.LinkedList;


class LLTasks {
    public static void removeOddLengthStrings(LinkedList<String> ll) {
    // Напишите свое решение ниже
        LinkedList<String> list = new LinkedList<>();
        for (String s : ll) {
            if(s.length()%2 == 0){
                list.add(s);
            }
        }
        ll.removeAll(list);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
        for (String arg : args) {
            ll.add(arg);
        }
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}
