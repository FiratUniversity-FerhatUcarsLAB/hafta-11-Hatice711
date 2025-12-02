/**
* Ad Soyad : Hatice Kırmızgül
* Öğrenci No : 250541102
* Açıklama : Java da methot çağırma, ifade değerlendirmesi.
* Tarih : 2.12.2025
*/    


public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // CEVAP 1 :
        // Return eden metodu çağırıp dönen methodu kullanmazsak 
        // Java herhangi bir uyarı vermez.
        // Metot normal şekilde çalışır, dönen değer kullanılmaz.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // CEVAP 2 :
        // Burada void kullanamayız çünkü bir ifade değil.
        // Java bir değeri olmayan ifadeyi başka işlemde kullanamaz.
        // Derleme hatası olur.
        // Çünkü sayHello() metotu void döndürür, yani bir değeri yoktur.

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
