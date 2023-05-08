import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar;
       Scanner _scanner= new Scanner(System.in);
       System.out.println("Ücret Tutarını Giriniz: ");
       tutar = _scanner.nextDouble();

        double kdv = tutar > 1000 ? 0.08 : 0.18;
        kdvTutar = tutar * kdv;
        kdvliTutar=tutar+ kdvTutar;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Fiyat: " + kdvliTutar);
        }
    }
