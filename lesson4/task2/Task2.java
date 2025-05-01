//даны два  Deque представляющих из себя два неотрицательных целых числа. Цифры хранятся в обратно порядке
// и каждый из их узлов содержит одну цифру. Сложите два числа и верните сумму в ввиде связного спика.
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task2 {
    public static void main(String[] args){
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        Task2 task2 = new Task2();
        System.out.println(task2.sum(d1,d2).toString());

    }
    public Deque<Integer> sum(Deque<Integer> d1,Deque<Integer> d2){
        if(d1==null|| d2 == null){
            throw new IllegalStateException();
        }
        Deque<Integer> res = new ArrayDeque<>();
        int digit = 0;
        while (d1.size()>0 || d2.size()>0){
            int sum = 0 + digit;
            if(d1.size()>0){
                sum = sum + d1.poll();
            }
            if(d2.size()>0){
                sum = sum + d2.poll();
            }
            if(sum>9){
                digit = 1;
                sum = sum - 10;
            }
            
            res.offer(sum);
        }
        if (digit!=0){
                res.offer(digit);
            }
        return res;
    }
}
