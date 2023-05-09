import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String kullaniciadi,sifre,yeniSifre;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciadi=scanner.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre=scanner.nextLine();

        if (kullaniciadi.equals("patika") && sifre.equals("190")){
            System.out.println("Başarılı bir şekilde giriş Yaptınız");
        }
        else {
            System.out.println("Şifreniz veya kullanıcı adınız yanlış. \nŞifrenizi değiştirmek istermisiniz?");
            System.out.println(" E/H");
            String secim=scanner.nextLine().toUpperCase();

            switch (secim){
                case "E":
                    System.out.println("Yeni şifrenizi giriniz: ");

                     yeniSifre=scanner.nextLine();
                    if (yeniSifre.equals(sifre)|| yeniSifre.equals("190")){
                        System.out.println("Girdiğiniz şifre önceki şifre ile aynıdır. Lütfen başka şifre giriniz.");
                    }
                    else  {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break ;
                case "H":
                    System.out.println("Tekrar giriş yapınız");
                    break;
            }
        }

    }
}