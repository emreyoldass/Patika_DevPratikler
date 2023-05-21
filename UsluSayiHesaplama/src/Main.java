import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sayi,us,sonuc=1;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        sayi=scanner.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        us= scanner.nextInt();
        for(int i= 1;i<=us;i++){
            sonuc=sayi*sonuc;
        }
        System.out.println("Sonuç: "+sonuc);
    }
}