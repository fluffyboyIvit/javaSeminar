// Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
// Используйте Deque для хранения истории.
// ● visitSite(String site): Добавляет сайт в историю посещений.
// ● back(int steps): Возвращает название сайта, который был посещен
// steps назад, или null, если таких шагов нет.
// ● getHistory(): Возвращает список сайтов в истории посещений, от
// последнего посещенного к первому.

import java.util.Deque;
import java.util.LinkedList;
class BrowserHistory {
// Напишите свое решение ниже
    Deque<String> dq = new LinkedList<>();
    public void visitSite(String site) {
    // Напишите свое решение ниже
        dq.add(site);
    }
    public String back(int steps) {
    // Напишите свое решение ниже
        if(steps>dq.size()) return null;
       
        return dq.stream().skip(steps).findFirst().orElse(null);
    }
    public Deque<String> getHistory() {
    // Напишите свое решение ниже
        return dq;
        
        
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }
}
