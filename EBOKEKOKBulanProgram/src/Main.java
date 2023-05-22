import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,ebob=1,ekok=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Küçük sayıyı giriniz:  ");
        sayi1 = input.nextInt();
        System.out.print("Büyük sayıyı giriniz: ");
        sayi2 = input.nextInt();
        int i=1;
        while(i <= sayi1){
            if(sayi1%i==0 && sayi2%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);
        while(i<=sayi1*sayi2){
            if(i%sayi1==0 && i%sayi2==0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("Ekok: " + ekok);
    }
}