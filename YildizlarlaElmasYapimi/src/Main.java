import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n ;
        System.out.print("Kaç yıldızlı elmas oluşturmak istediğinizi giriniz: ");
        Scanner scanner= new Scanner(System.in);
        n=scanner.nextInt();
        for(int i=1;i <=n;i++) {
            for(int j=1;j <=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k <=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=1;j <=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}