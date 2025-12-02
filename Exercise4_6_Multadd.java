/**
* Ad Soyad : Hatice Kırmızıgül
* Öğrenci No : 250541102
* Açıklama :
* Tarih : 02.12.2025
*/    


public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO
        return 0.0;
    }

    public static double expSum(double x) {
        // TODO
        return 0.0;
    }

    public static void main(String[] args) {
        // TODO: test methods
    }
}


public class Multadd {

    // 1) a * b + c işlemini yapan metot
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // 2) expSum metodu:
    // x * e^-x + sqrt(1 - e^-x)
    public static double expSum(double x) {
        double eNegX = Math.exp(-x);     // e^-x
        return x * eNegX + Math.sqrt(1 - eNegX);
    }

    public static void main(String[] args) {

        // 3) Basit test
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));  // 2*3 + 4 = 10

        // 4) sin(pi/4) + cos(pi/4)/2 ifadesi
        double sin = Math.sin(Math.PI / 4);
        double cos = Math.cos(Math.PI / 4);
        // sin + cos/2 = multadd(cos, 0.5, sin)
        double result1 = multadd(cos, 0.5, sin);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

        // 5) log 10 + log 20
        // Not: Math.log = doğal log (ln)
        double result2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log(10) + log(20) = " + result2);

        // 6) expSum testi
        System.out.println("expSum(1) = " + expSum(1));
    }
}






