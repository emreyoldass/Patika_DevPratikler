import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double _gidilenKm, _minTutar=20,_acilisUcreti=10,_taksimetreTutari,_kmTutari=2.20;

        Scanner _scanner = new Scanner(System.in);
        System.out.println("Gidilen KM giriniz: ");

        _gidilenKm= _scanner.nextDouble();

        _taksimetreTutari=(_gidilenKm*_kmTutari)+_acilisUcreti;
        _taksimetreTutari= _taksimetreTutari < _minTutar ? _minTutar : _taksimetreTutari;

        System.out.println(_taksimetreTutari);
    }
}