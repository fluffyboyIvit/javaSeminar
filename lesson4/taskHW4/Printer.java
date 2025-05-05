// Реализуйте метод rotateDeque в классе DequeTasks, который принимает
// Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
// позиций. Если n отрицательное, повернуть влево.

import java.util.Deque;
import java.util.LinkedList;
class DequeTasks {
public static void rotateDeque(Deque<Integer> deque, int n)
{
// Напишите свое решение ниже
    if (deque.isEmpty()) return; // если deque пустое, возвращает его
    int size = deque.size(); //переменной размер передаём значение размера очереди deque
    n %= size;  // чтобы не выполнять лишние операции, переменую n остаточным делением делим на size
    if(n<0) n+= size; // если n меньше нуля, то прибавляем size, для коректной работы
    for(int i = 0; i<n;i++){
        deque.addLast(deque.removeFirst()); // пока работает цикл и i меньше n, мы будет сначала удалять элемент из начала очереди, поскольку remove возвращает значение, то это же значение добавляем в конец очереди
    }
    System.out.println(deque); // выводим очередь на экран
}
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length < 1) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
        n = 2;
        } else {
        for (int i = 0; i < args.length - 1; i++) {
            deque.add(Integer.parseInt(args[i]));
        }
        n = Integer.parseInt(args[args.length - 1]);
        }
        DequeTasks.rotateDeque(deque, n);
    }
}

