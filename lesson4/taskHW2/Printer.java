

import java.util.LinkedList;
class MyStack {
    // Напишите свое решение ниже
    LinkedList<String> stack = new LinkedList<>();
    public void push(String element) {
        // Напишите свое решение ниже
        LinkedList<String> list = new LinkedList<>();
        stack.addFirst(element);
    }
    public String pop() {
        // Напишите свое решение ниже
        return stack.removeFirst();
    }
    public String peek() {
        // Напишите свое решение ниже
        return  stack.peekFirst();
    }
    public LinkedList<String> getElements() {
        // Напишите свое решение ниже
        return new LinkedList<>(stack);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
    MyStack stack = new MyStack();
    if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        stack.push("apple");
        stack.push("banana");
        stack.push("pear");
        stack.push("grape");
    } else {
        for (String arg : args) {
        stack.push(arg);
        }
    }
    System.out.println(stack.getElements());
    System.out.println(stack.pop());
    System.out.println(stack.getElements());
    System.out.println(stack.peek());
    }
}

