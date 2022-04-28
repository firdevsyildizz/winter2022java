package javaLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda2 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(2, 3, 5, 13, 15, 16, -6));
        ciftKarePrint(sayi);//1156 484 256 36 bu ciktiyi verdi
        System.out.println("\n ***************");
        tekKupBirFazlaPrint(sayi);//28 126 2198 3376
        System.out.println("\n ***************");
        ciftKarekokPrint(sayi);
        System.out.println("\n ***************");
        maxEl(sayi);
        System.out.println("\n ***************");
        ciftKareMaxBul(sayi);
        System.out.println("\n ***************");
        ellTopla(sayi);
        System.out.println("\n ***************");
        ciftCarp(sayi);


    }



    //task funcional programming ile listin cift elemanlarinin karelerini ayni satirda aralarinda bosluk birakarak print ediniz

    public static void ciftKarePrint(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).
                map(t -> t * t).//acyion experience yapiyoruz.burdaki ayni gordugumuz map degil burdaki islem yapan map
                forEach(Lambda01::yazdir);
        //map ==>stream icersindeki elemanlari baska tiplere donusturmek veya
        //uzerinde islem yapmak (update icinmap kullanilmaktadir)
    }

    //2-task: funcional programming ile listin tek elemanlarinin kuplerininbir fazlasini ayni satirda aralarinda bosluk birakarak print ediniz
    public static void tekKupBirFazlaPrint(List<Integer> sayi) {
        sayi.stream().//sayi akisa alindi
                filter(t -> t % 2 != 0).//tek elemanlar alindi
                map(t -> (t * t * t) + 1).//bu elemanlarin kuplerinin bir fazlasi alindi
                forEach(Lambda01::yazdir);//yazdirildi
    }

    //3-task: funcional programming ile listin cift elemanlarinin karakoklerinin  ayni satirda aralarinda bosluk birakarak print ediniz
    public static void ciftKarekokPrint(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).
                map(Math::sqrt).//math classindan hazir karakokunu alan method
                //forEach(Lambda01::yazdir); yazdirmaz cunku int calisiyor biz maptan cikardigimiz icin calismaz
                        forEach(t -> System.out.print(t + " "));//metotla  kabul etmedi o yuzden experrision yaptik

    }

    //4-task: listinen buyyuk elemanini  print
    public static void maxEl(List<Integer> sayi) {
        //AKISTAKI ELEMANLARA YAPTIGINIZ AKSIYONDA BIR!!! SONUC ISTIYORSANIZ RADUCE METHOD KULLANILIR
        Optional<Integer> maxSayi = sayi.stream().reduce(Math::max);
        //en buyuk sayiyi getir elde ettigim sayiyi bi yere bagliyorum bas bolum(=) optional yapiyosun import gibi
        // (bazen ozel durumlar olabilir hata verebilir oyuzden java onu optional ile handle eder)
        System.out.println(maxSayi);
        System.out.println("diger yontem" + sayi.stream().reduce(Math::max));
        //not!!!! reduce ve for each terminal islemidir ondan sonra birsey baglanmaz

          /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
​
        */


    }
    //5-task: listin cift elemaninin karelerinin en buyugunu   print ediniz
   public static void ciftKareMaxBul(List<Integer> sayi) {
       System.out.println(sayi.stream().filter(Lambda01::ciftBul).
                map(t->t*t).//karelerini aldik
                reduce(Math::max));//en buyugu yazdirdik //Optional[256]
       System.out.println(sayi.stream().filter(Lambda01::ciftBul).
               map(t->t*t).//karelerini aldik
                       reduce(Integer::max));//daha hizli calisir specific //Optional[256]


    }
        //6-task listteki tum elemanlarin toplamini yaz
         //lambda expession ....
       public static void ellTopla(List<Integer> sayi) {
        //1 YOL LAMBDA EXPRESSION
       int toplam= sayi.stream().reduce(0,(a,b)->a+b);//lambda expession
           /*
           a ilk degerini herzaman atanan degerden identity alir a=0 ilk de
           b degerini her zaman stream dan akisindan alir akistaki sayi 11 mesala
           a ilk degerinden sonraki her degeri action (islemden)alir 0+11 a 11 oldu
            */
           System.out.println(toplam);//48
           //2 yol METHOD REF
           Optional<Integer> topla=sayi.stream().reduce(Integer::sum);//method ref
           //bazen birinci seferdeki gibi handle etmek zorunda kalabilirsiniz
           System.out.println(sayi.stream().reduce(Integer::sum));//OPTIONAL 48



}
//7-TASK:LISTEDEKI CIFT ELEMANLARIN CARPIMINI YAZINIZ
    public static void ciftCarp (List <Integer>sayi){
        //lambda expression
        System.out.println(sayi.stream().filter(Lambda01::ciftBul).reduce(1,(a,b)->(a*b)));
        //method ref
        System.out.println(sayi.stream().filter(Lambda01::ciftBul).reduce(Math::multiplyExact));


    }


}


