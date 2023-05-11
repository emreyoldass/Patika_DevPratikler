import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            int hava;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        hava=scanner.nextInt();
            if (hava<5) {
                System.out.println("Kayak yapabilirsiniz");
            } else if (hava>=5 && hava<15) {
                System.out.println("Sinemaya gidebilirsiniz");
            } else if (hava>=15&& hava<25) {
                System.out.println("Pikniğe gidebilirsiniz");
            } else{
                System.out.println("Yüzmeye gidebilirsiniz");
            }
    }
}