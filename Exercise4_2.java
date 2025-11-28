/**
* Ad Soyad : Hatice Kırmızıgül
* Öğrenci No : 250541102
* Açıklama : Birbirini çağıran methotlar programı
* Tarih : 28.11.2025
*/  


import java.util.Scanner;
public class Exercise4_2 {

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {//1
        zippo("rattle", 13); //2
    
    }

    public static void baffle(String blimp) {//7
        System.out.println(blimp); //8
        zippo("ping", -5); //9
    }

    public static void zippo(String quince, int flag) {//3,10
        if (flag < 0) { //11
            System.out.println(quince + " zoop"); //12
        } else {//4
            System.out.println("ik"); //5
            baffle(quince); //6
            System.out.println("boo-wa-ha-ha"); //13
        }
    }
}

/** Soruların Cevapları
2. quince
3.  ik
    rattle
    ping zoop
    boo-wa-ha-ha
4.  Sadece 24.satır iki kere çalışmıştır
    */
