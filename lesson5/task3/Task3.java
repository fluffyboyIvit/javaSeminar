//Дана строка. необходимо  написать метод, который отсортирует слова по строке и длинне с помощью TreeMap.Строки с одинаковой длинной не должны потерятся.

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task3{
    public static void main(String[] args){
    String str = "Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты";
    Task3 task3  = new Task3();
    System.out.println(task3.getSortWordForLength(str));
    }
    public String getSortWordForLength(String str){
        if (str == null || str.isEmpty()){
            return null;
        }
        TreeMap<Integer,String> tm = new TreeMap<>();
        String[] list = str.split(" ");
        for (String string : list) {
            int size = string.length();
            if(tm.containsKey(size) && !tm.get(size).contains(string)){
                tm.put(size,tm.get(size)+", "+ string);
            }
            else{
                tm.put(size,string);
            }
        }
        return tm.toString();
    }
}
