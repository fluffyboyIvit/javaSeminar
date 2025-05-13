import java.util.HashMap;
import java.util.Map;


public class Task2{
    public static void main(String[] args) {
        Map<String,String> path = new HashMap<>(); //создаём новый hashmap
        //добавляем ключи и значения в hashmap
        path.put("Москва","Самара");
        path.put("Курск","Пенза");
        path.put("Самара","Курск");
        Task2 task2 = new Task2(); // создаём объект
        System.out.println(task2.getFinalCity(path));// выводим на экран объект, котору присвоена результат функции, которая принимает значение hashmap path
    }
    public String getFinalCity(Map<String,String> path){
        // создаём цикл который перебирает значения ключей
        for(String end: path.values()){
            // если такое значение не присутсвует среди ключей, то возвращаем его
            if(!path.containsKey(end)) return end;
        }
        return null;// если у каждого значения, есть такой же ключ, то возвращается значение null(проще говоря, если цикл ничё не нашел то вернули null)
    }
}