// Дан массив объектов, где каждый объект представляет собой строку данных, и
// массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// строкой, а значения в строках разделяются запятыми.
// Пример:
// String[] headers = {"Name", "Age", "City"};
// String[][] data = {
// {"John", "30", "New York"},
// {"Alice", "25", "Los Angeles"},
// {"Bob", "35", "Chicago"}
// };
// Результат:
// Name,Age,City
// John,30,New York
// Alice,25,Los Angeles
// Bob,35,Chicago

class CSVGenerator {
    public static String generateCSV(String[] headers, String[][] data) {
    // Введите свое решение ниже
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i<= headers.length-1; i++) {

        sb.append(headers[i]);
        if(i!=headers.length-1) sb.append(",");
    }
    sb.append("\n");
    for (int i = 0; i <= data.length-1;i++) {
        for (int j = 0 ; j<= data[i].length-1;j++) {
            sb.append(data[i][j]);
            if(j!=data[i].length-1) sb.append(","); 
        }
        sb.append("\n");
    }
    return sb.toString();

//    эталонное решение:
 // StringBuilder csv = new StringBuilder();
// // Добавление заголовков
// csv.append(String.join(",", headers)).append("\n");
// // Добавление данных
// for (String[] row : data) {
// csv.append(String.join(",", row)).append("\n");
// }
// return csv.toString().trim();
    }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
    public static void main(String[] args) {
    String[] headers = {};
    String[][] data = {};
    if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать эти параметры
    headers = new String[]{"Name", "Age", "City"};
    data = new String[][] {
    {"John", "30", "New York"},
    {"Alice", "25", "Los Angeles"},
    {"Bob", "35", "Chicago"}
    };
    } else {
    // Преобразование строковых параметров в массивы
    // Пример обработки данных можно дополнить в зависимости от формата args
    }
    CSVGenerator ans = new CSVGenerator();
    System.out.println(ans.generateCSV(headers, data));
    }
    }