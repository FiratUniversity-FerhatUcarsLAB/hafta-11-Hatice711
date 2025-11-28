/**
* Ad Soyad : Hatice Kırmızıgül
* Öğrenci No : 250541102
* Açıklama : Tarihleri Avrupa ve Amerikan formantında yazan program
* Tarih : 28.11.2025
*/


import java.util.Scanner;

public class Exercise4_1 {


   public static void printAmerican( String haftaninGunu,int day, int month, int year){
       if( (day > 0 && month > 0 && year > 0) && (day < 32 && month < 13 && year < 2026)) {
           System.out.printf("%s/%d/%d/%d\n ", haftaninGunu,month,day, year);
       }else{
           System.out.println("Lütfen geçerli bir tarih giriniz!");
       }
    }

    public static void printEuropean(int d, int m, int y, String day_name){
       if( (d > 0 && m > 0 && y > 0) && (d < 32 && m < 13 && y < 2026)) {
           System.out.printf("%d/%d/%d/%s\n ", d, m, y, day_name);
       }else{
           System.out.println("Lütfen geçerli bir tarih giriniz!");
       }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int gun, ay, yil;
        String gunAdi;
        System.out.println("Gün : ");
        gun = keyboard.nextInt();
        System.out.println("Ay : ");
        ay = keyboard.nextInt();
        System.out.println("Yil : ");
        yil = keyboard.nextInt();
        System.out.println("Günün Adı (Örn.Salı, Cuma vb.) : ");
        gunAdi = keyboard.next();
        printEuropean(gun,ay,yil,gunAdi);
        printAmerican(gunAdi,gun,ay,yil);
    }
}
