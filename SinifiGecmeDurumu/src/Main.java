import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        matematik= scanner.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik=scanner.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce=scanner.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya=scanner.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik=scanner.nextInt();

        if (matematik < 0 || matematik > 100)matematik=0;
        if (fizik < 0 || fizik > 100) fizik=0;
        if (turkce < 0 || turkce > 100) turkce=0;
        if (kimya < 0 || kimya > 100)kimya=0;
        if (muzik < 0 || muzik > 100) muzik=0;

        double ortalama = (matematik+fizik+turkce+kimya+muzik)/5d;
        System.out.println("Ortalamanız: " + ortalama);
        if (ortalama>=55){
            System.out.println("Geçtiniz");
    }
        else{
            System.out.println("Kaldınız");
        }
    }
}