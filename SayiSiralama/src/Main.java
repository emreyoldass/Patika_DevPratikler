import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int sayi1,sayi2,sayi3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        sayi1=scanner.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        sayi2=scanner.nextInt();
        System.out.print("3.sayıyı giriniz: ");
        sayi3=scanner.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.println(sayi1 + "<" + sayi2 + "<" + sayi3);
            }
            else {
                System.out.println(sayi1 + "<" + sayi3 + "<" + sayi2);
            }

        } else if (sayi2<sayi1 && sayi2<sayi3) {
            if (sayi1 < sayi3) {
                System.out.println(sayi2 + "<" + sayi1 + "<" + sayi3);
            }
            else {
                System.out.println(sayi2 + "<" + sayi3 + "<" + sayi1);
            }

        }
        else {
            if (sayi1 < sayi2) {
                System.out.println(sayi3 + "<" + sayi1 + "<" + sayi2);
            }
            else {
                System.out.println(sayi3 + "<" + sayi2 + "<" + sayi1);
            }
        }


    }
}