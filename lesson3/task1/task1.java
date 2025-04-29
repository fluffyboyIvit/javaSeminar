import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,9,2,6,4,3,5,7,8,0));
        Task1 task1 = new Task1();
        System.out.println(task1.sortByCollection(list).toString());
        System.out.println(task1.sortByComparator(list).toString());
    }
    public List<Integer> sortByCollection(List<Integer> list){
        Collections.sort(list);
        // return new ArrayList<>();
        return list;
    }
    public List<Integer> sortByComparator(List<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        // return new ArrayList<>();
        return list;
    }

}