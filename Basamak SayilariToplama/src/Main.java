import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int sayi,toplam=0;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Basamaklarını Toplamak istediğiniz sayıyı giriniz: ");
        sayi=scanner.nextInt();
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Sayının basamaklarının toplamı: " + toplam);
    }
}
