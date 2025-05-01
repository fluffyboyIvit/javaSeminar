//Дана строка содержащая только символы '(',')','{','}','['']', определите
// является ли входная строка логически верной.
//Входная строка логически верная если: 
//1)Открытые скобки должны быть закрыты скобками того же типа
//2)Открытые скобки должны быть закрыты скобками в правильном порядке.Каждая закрытая скобка имеет соответсвующую открытую скобку того же типа.

import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        String s1 = "{[()]}";
        Task3 task3 = new Task3();
        System.out.println(task3.validate(s1));

    }
    public boolean validate(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{'|| c == '['){
                stack.push(c);
            }else if (stack.isEmpty()){
                return false;
            }else if (c==')'&& stack.pop()!= '('){
                return false;
            }else if (c==']'&& stack.pop()!='['){
                return false;
            }else if(c == '}'&& stack.pop()!='{'){
                return false;
            }
        }
        return stack.empty();
    }
}
