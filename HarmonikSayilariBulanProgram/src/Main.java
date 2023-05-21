import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n;
        double sonuc=0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısını giriniz: ");
        n= scanner.nextInt();
        for (double i= 1;i<=n;i++){
            sonuc+=(1/i);
        }
        System.out.println("Sonuç: "+ sonuc);
    }
}