import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,secim,sonuc;

        Scanner scanner= new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        sayi1=scanner.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        sayi2=scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        secim=scanner.nextInt();

        switch (secim) {
            case 1: sonuc=sayi1+sayi2;
                System.out.println("Toplama sonucu:" + sonuc);
                break;
            case 2: sonuc=sayi1-sayi2;
                System.out.println("Çıkarma sonucu:" + sonuc);
                break;
            case 3: sonuc=sayi1*sayi2;
                System.out.println("Çarpma sonucu:" + sonuc);
                break;
            case 4:
                if (sayi2!=0){
                sonuc=sayi1/sayi2;
                System.out.println("Bölme sonucu:" + sonuc);
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }
    }
}