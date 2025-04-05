// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.
// Пример:
// line1

// line2



// line3
// Результат:
// line1
// line2
// line3


class TextCleaner {
    public static String removeEmptyLines(String text) {
    // Введите свое решение ниже
        StringBuilder sb = new StringBuilder();
        String[] str1 = text.split("\n");
        for (String i : str1) {
            if (!i.trim().isEmpty()) {
                if(sb.length()>0){
                    sb.append("\n");
                }
                sb.append(i);
            }
            
        }
    
    return sb.toString();    
    }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
    public static void main(String[] args) {
    String text = "";
    if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать эти параметры
    text = "line1\n\nline2\n\nline3";
    } else {
    text = args[0];
    }
    TextCleaner ans = new TextCleaner();
    System.out.println(ans.removeEmptyLines(text));
    }
    }
    