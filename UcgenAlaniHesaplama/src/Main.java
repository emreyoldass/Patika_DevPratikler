import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double a,b,c,alan,u;
        Scanner _scanner = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz: ");
        a = _scanner.nextDouble();
        System.out.println("2. Kenarı Giriniz: ");
        b = _scanner.nextDouble();
        System.out.println("3. Kenarı Giriniz: ");
        c = _scanner.nextDouble();

        u  = (a+b+c) / 2;
        alan= Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı" + alan);
    }
}
