import java.util.Scanner;

public class Main {
    public static void main (String[] Args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = read.nextInt();

        System.out.print(isPalindrom(number));
    }

    static boolean isPalindrom(int number){
        int temp = number,invertedNumber=0,lastNumber;
        while (temp !=0)
        {
            lastNumber= temp %10;
            invertedNumber = (invertedNumber*10) + lastNumber;
            temp/=10;

        }
        if (number == invertedNumber) {
            System.out.println(number + " bir palindrom sayıdır.");
            return true;
        }
        else {
            System.out.println(number + "bir palindrom sayısı değildir.");
            return false;
        }
    }
}