import java.util.Scanner;
import java.util.SortedSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //
        int _matematik, _fizik, _kimya, _turkce , _tarih,_muzik,toplam;

        //Kullanıcı girişi icin Scanner sınıfı tanımlandı.
        Scanner _scanner = new Scanner(System.in);
        //Kullanıcı Değerlerini Alma

         System.out.println("Matematik notunuzu giriniz:");
         _matematik = _scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        _fizik = _scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        _kimya = _scanner.nextInt();

        System.out.println("Turkce notunuzu giriniz:");
        _turkce = _scanner.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        _tarih = _scanner.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        _muzik = _scanner.nextInt();
        toplam = (_matematik + _fizik + _kimya + _turkce + _tarih + _muzik);
        double sonuc = toplam/6;
        System.out.println("Derslerin ortalama sonucu:" + sonuc);
        System.out.print("Sonuca Göre: ");
        System.out.print(sonuc >= 60 ? "Gectiniz" : "Kaldınız");
    }
    }
