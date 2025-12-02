/**
* Ad Soyad : Hatice Kırmızgül
* Öğrenci No : 250541102
* Açıklama : Metot çağrılarının sırasını ve çıktı üzerinde etkisini anlamak için yazılıyor.
* Tarih : 28.11.2025
*/    


public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/** SORULARIN CEVAPLARI
    1.
# Stack Diagram


+---------------+
|  main()       |
+---------------+
       |
+---------------+
|    zoop()     |
+---------------+
       |
+---------------+
|    baffle()   |
+---------------+
       |
+---------------+
|      ping()   |
+---------------+


    2. No , I wug.
         You wugga wug.
       I wug.
