
public class program
{
    public static void main(String[] args) {
        int[] numbers = new int[] {1,1,0,1,1,1};
        int max = 0;
        int count = 0;
        for(int i = 0; i<numbers.length;i++)
        {   
            if (numbers[i] == 1){
                ++count;
            } else {
               
                count = 0;
            }
            if(count> max){
                max = count;
            }        


        }
        System.out.println(max);
    }
}