import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int ay, gun;
       String burc = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        ay=scanner.nextInt();
        System.out.print("Doğdunuz günü giriniz: ");
        gun=scanner.nextInt();
        if (ay==1){
           if (gun<22){
               burc ="Oğlak";
           }
           else{
               burc ="Kova";
           }
       } else if (ay==2) {
            if (gun<20){
                burc ="Kova";
            }
            else{
                burc ="Balık";
            }
        }
        else if (ay==3) {
            if (gun<21){
                burc ="Balık";
            }
            else{
                burc ="Koç";
            }
        }
        else if (ay==4) {
            if (gun<22){
                burc ="Koç";
            }
            else{
                burc ="Boğa";
            }
        }
        else if (ay==5) {
            if (gun<22){
                burc ="Boğa";
            }
            else{
                burc ="İkizler";
            }
        }
        else if (ay==6) {
            if (gun<23){
                burc ="ikizler";
            }
            else{
                burc ="Yengeç";
            }
        }
        else if (ay==7) {
            if (gun<24){
                burc ="Yengeç";
            }
            else{
                burc ="Aslan";
            }
        }
        else if (ay==8) {
            if (gun<24){
                burc ="Aslan";
            }
            else{
                burc ="Başak";
            }
        }
        else if (ay==9) {
            if (gun<24){
                burc ="Başak";
            }
            else{
                burc ="Terazi";
            }
        }
        else if (ay==10) {
            if (gun<24){
                burc ="Terazi";
            }
            else{
                burc ="Akrep";
            }
        }
        else if (ay==11) {
            if (gun<24){
                burc ="Akrep";
            }
            else{
                burc ="Yay";
            }
        }
        else if (ay==12) {
            if (gun<23){
                burc ="Yay";
            }
            else{
                burc ="Oğlak";
            }
        }
        else{
            System.out.println("Yanlış tarih bilgisi girdiniz.");
        }
        System.out.println("Burcunuz: "+ burc);
    }
}