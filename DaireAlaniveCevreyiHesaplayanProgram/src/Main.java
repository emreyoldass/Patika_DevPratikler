import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int _r;
        double _pi=3.14,_alan,_cevre,_merkezAciOlcusu,_daireDilimAlani;

        Scanner _scanner= new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        System.out.println("Dairenin merkez açı ölçüsünü giriniz: ");

        _r=_scanner.nextInt();
        _alan = _pi*_r*_r;
        _cevre =2*_pi*_r;


        _merkezAciOlcusu=_scanner.nextDouble();
        _daireDilimAlani=(_pi * (_r*_r) * _merkezAciOlcusu) / 360;

        System.out.println("Dairenin alanı: " + _alan);
        System.out.println("Dairenin çevresi: "+ _cevre);
        System.out.println("Dairenin dilim alanı: " + _daireDilimAlani);
    }
}