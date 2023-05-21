import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        Scanner scanner = new Scanner(System.in);
        int hak = 3, bakiye = 1500, secim;
        while (hak > 0) {
            System.out.print("Kullanıcı Adını: ");
            kullaniciAdi = scanner.nextLine();
            System.out.print("Şifreniz: ");
            sifre = scanner.nextLine();
            if (kullaniciAdi.equals("emre") && sifre.equals("1907")) {
                System.out.println("X Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int yatirilanmiktar = scanner.nextInt();
                            bakiye += yatirilanmiktar;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int cekilecekmiktar = scanner.nextInt();
                            if (cekilecekmiktar > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= cekilecekmiktar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }

                } while (secim != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}

