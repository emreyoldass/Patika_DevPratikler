import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int toplam=0,sayi;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Bir sayi giriniz:");
            sayi=scanner.nextInt();
                if (sayi%4==0 ){
                    toplam+=sayi;
            }
        }while(sayi%2==0);
        System.out.println("Tek Sayı Girdiniz");
        System.out.println("Toplam: "+toplam);
    }
}