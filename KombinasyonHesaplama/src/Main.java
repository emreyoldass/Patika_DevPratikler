import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int n,r,nfaktoriyel=1,rfaktoriyel=1,nrfaktoriyel=1,sonuc,farki;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        r=scanner.nextInt();
        for (int i=1;i<=n;i++){
            nfaktoriyel=nfaktoriyel*i;
        }
        for (int i=1;i<=r;i++){
            rfaktoriyel=rfaktoriyel*i;
        }
        farki=n-r;
        for (int i=1;i<=farki;i++){
            nrfaktoriyel=nrfaktoriyel*i;
        }
        System.out.println("Birinci sayının faktoriyel değeri: "+nfaktoriyel);
        System.out.println("ikinci sayının faktoriyel değeri: "+rfaktoriyel);
        System.out.println("İki sayının farkının faktoriyeli: "+farki+"!"+"\nİki sayının farkının faktoriyel değeri: "+nrfaktoriyel);
        //formül C(n,r) = n! / (r! * (n-r)!)
        System.out.println("Kombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)");
        sonuc=nfaktoriyel/(rfaktoriyel*nrfaktoriyel);
        System.out.println("Sonuç: "+sonuc);


    }
}