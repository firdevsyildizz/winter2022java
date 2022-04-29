package javaLambda;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Lambda3 {
    public static void main(String[] args) {
        List<String>yemek=new ArrayList<>(Arrays.asList("dolma","sarma","manti","karniyarik","sarma"));
        alfBykTekrrsiz(yemek);
        System.out.println("\n ****");
        chrSayisiTersSirali(yemek);
        System.out.println("\n ****");
        chrSayiBkSirala(yemek);
        System.out.println("\n ****");
        sonHarfBkSirala(yemek);
        System.out.println("\n ****");
        System.out.println("\n ****");
    }
    //task1-list elemanlarini alfabetik buyuk harf kucuk harf ve tekrarsiz print ediniz
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void alfBykTekrrsiz(List<String>yemek){
        yemek.stream().
               // map(t->t.toUpperCase()).//jambda expession yaptikbuyuk harf yapti
                map(String::toUpperCase).//methot ref yaptik buyuk harf yapti
                sorted().//alfabetik sira yapti
                distinct().//benzersiz /tekrarsiz hale geldi iki sarma vardi bir yazdirdi
                forEach(t-> System.out.print(t+" "));//lambdadaki 1 yazdir metodunu kullanamazsin o int bu string

        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    }
// Task 2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
public static void chrSayisiTersSirali(List<String>yemek){
        yemek.stream().
                map(t->t.length()).//sana her kelimenin length getirdi
                //map(String::length).
                sorted(Comparator.reverseOrder()).//tersten baslatti
                distinct().
                forEach(t-> System.out.print(t+" "));
               //forEach(Lambda01::yazdir); //10 5


}
// Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..

    public static void chrSayiBkSirala(List<String>yemek){
        yemek.stream().
                sorted(Comparator.comparing(String::length)).
                //eleman sayilarini karsilastir neye gore=> stringlerin karakter sayilarina gore karsilastir
                forEach(t-> System.out.print(t+" "));
    }
// Task : List elemanlarini son harfine gore ters sirali print ediniz..

    public static void sonHarfBkSirala(List<String>yemek){
        yemek.stream().
                sorted(Comparator.
                        comparing(t->t.toString().charAt(t.toString().length()-1)).
                        //kelimenin son harfi charat kullanmak icin to string methodunu kullaniyoruz
                        reversed()).
                //ters siraladi
                        forEach(t-> System.out.print(t+" "));
    }
}
