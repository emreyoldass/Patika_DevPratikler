import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int count=0,toplam=0,sayi;
        double ortalama;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi=scanner.nextInt();

        for (int i=0;i<sayi;i++){
            if ((i%3==0) ||(i%4==0)){
                toplam+=i;
                count++;
                System.out.println("3'e ve ya 4'e tam bölünen sayı: "  + i);

            }

        }
        ortalama=toplam/count;
        System.out.println("3'e ve ya 4'e tam bölünen sayıların ortalaması: "+ortalama);
    }
}