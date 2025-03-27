
public class program {
    public static void main(String[] args) {
        String str ="Добро пожаловать на курс по Java";
        String[] array = str.split(" ");
        for(int i = array.length-1; i>=0; i--){
                System.out.printf("%s ",array[i] );

        } 
    }
}
