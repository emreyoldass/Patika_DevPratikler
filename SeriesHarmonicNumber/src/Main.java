import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int item:numbers) {
              sum+=1/item;
        }
        System.out.println(Arrays.toString(numbers)+" Dizisinin "+
       "\nHarmonik ortalaması : " + numbers.length / sum);
    }
}