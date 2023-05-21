import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi= scanner.nextInt();
        for (int i=1;i<=sayi;i*=4){
            System.out.println("4'ün kuvvetleri: "+i);
        }
        for (int i=1;i<=sayi;i*=5){
            System.out.println("5'in kuvvetleri: "+i);
        }
    }
}