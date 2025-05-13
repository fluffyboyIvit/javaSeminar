// Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Task1{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3); //создали список лист и добавили в него массив
        Task1 task1 = new Task1(); //создали объект
        System.out.println(task1.getSumOfUniqueItems(list));// выводим на экран объект task1 которому присвоена значение функции которая принимает список list

    }
    public Integer getSumOfUniqueItems(final List<Integer> list){
        //если функция равна null или пустая, то возвращаем значение 0
        if (list == null|| list.isEmpty()){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>(); // создаём новый hashmap
        //создали цикл который перебирает значения в списке list
        for(Integer num1: list){
            //  если в hashmap уже есть ключ, то прибавляем в значение ключа + 1(тут вроде он просто пересоздаётся со значением равным >1, но в целом это показывает что данный ключ не уникален.).
            // если нет, то создаём новый ключ и присваем ему значение равное 1
            if(map.containsKey(num1)){
                map.put(num1,map.get(num1)+1);
            }else{
                map.put(num1,1);
            }
        }
        int counter = 0;// создали счётчик
        // создали цикл который пекребирает ключи
        for(Integer num2:map.keySet()){
            //если значение ключа равно 1, то ключ прибавляем к счётчику;
            if(map.get(num2)==1) {
                counter += num2;

            }
        }
       
        return counter; //возвращаем счетчик
    }
}

