// дана последовательность цифр и нужно проверить является ли она полиндромом.
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class Task1 {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,2,1));
        Task1 task1 = new Task1();
        System.out.println(task1.checkOn(deque));

    }
    public boolean checkOn(Deque<Integer> deque){

        if (deque == null){
            throw new IllegalStateException();  
        }
        if(deque.size()<=1){
            return true;
        }
        while (deque.size()>=2) {
            if(deque.pollFirst()!=deque.pollLast()){
                return false;
            }
            
        }
        return true;
    }
}
