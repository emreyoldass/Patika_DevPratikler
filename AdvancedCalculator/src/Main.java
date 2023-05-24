import java.util.Scanner;
public class Main {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scanner.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();
        System.out.print("Modu giriniz: ");
        int numbermod=scanner.nextInt();
        int result=1;
        while (number>=numbermod){
            number -= numbermod;
        }
        System.out.println("Sonuç : " + number);
    }
    static void rectangle(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        int longEdge= scanner.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        int shortEdge= scanner.nextInt();
        int areaResult=longEdge*shortEdge;
        int environmentResult= 2*(longEdge+shortEdge);
        System.out.println("Dikdörtgenin alanı: "+areaResult);
        System.out.println("Dikdörtgenin çevresi: "+environmentResult);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme işlemi\n"
                + "5 - Üslü Sayı Hesaplama\n"
                + "6 - Faktoriyel Hesaplama\n"
                + "7 - Mod Alma\n"
                + "8 - Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0 - Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
