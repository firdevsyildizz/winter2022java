package printf;

public class C01PrintF {
    public static void main(String[] args) {
        int num = 123;
        String str = "Reyyan";
        String str2 = "Reyyan nalbantcilar";
        double dob=1.02334;
        System.out.println(num + "-"+str+"-"+dob+"-");//onceden bildigimiz yazma sekli=> 123-Reyyan-1.02334-
        System.out.printf("sayi: %d,str : %s, dou: %f",num,str,dob);//%d integer tam sayi s=>string f=>ondalikli sayi ifade eder
        //sayi: 123,str : Reyyan, dou: 1,023340
        System.out.println();
        System.out.printf("sayi: %d,str : %10.10S, dou: %f",num,str2,dob);//S buyuk harfle yazar 10 yazarsam
        // 10 boslukbirakir saga yaslar sola istiyorsak -10yazariz./uzun bir sey yazdirdik sadece 10 hanesini yazdir dersem 10.10
        //sayi: 123,str : REYYAN NAL, dou: 1,023340
        System.out.println();
        System.out.printf("sayi: %-10d,str : %10.10S, dou: %f",num,str2,dob);//sayi: 123       ,str : REYYAN NAL, dou: 1,023340
        //digitlerde sayiyi sinirlandiramiyoruz saga sola kaydirma yapabiliyoruz
        System.out.println();
        System.out.printf("sayi: %-10d,str : %10.10S, dou: %-7.3f",num,str2,dob);//.3 =>virgulden sonra 3 rakam yazsin 7.3 uzunlugu 7 u gecsin   1,023
        //onde bosluk olmasin sifir olsun istereniz %-7.3f =>- konulur

    }
}
