import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] valueList = {15,32,-7,2,25,0,9,85,-32};
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi : " + Arrays.toString(valueList));

        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int min = number;
        int max = number;
        Arrays.sort(valueList);
        for(int item: valueList){
            if(item > number){
                max = item;
                break;
            }}
        for(int i = valueList.length-1; i >= 0; --i){
            if(valueList[i] < number){
                min = valueList[i];
                break;
            }}
        System.out.println("En yakın büyük sayı : " + max);
        System.out.println("En yakın küçük sayı : " + min);

    }
}