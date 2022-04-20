package collection;

import java.util.HashSet;
import java.util.Set;

public class C02Hash {
    public static void main(String[] args) {
        String str= "weather is good";
        System.out.println(str.hashCode());//381922759 veriyor kendi icinde hash code uretiyor

        Set<Integer>numk=new HashSet<>();
        System.out.println(numk.hashCode());//0
        numk.add(10);
        System.out.println(numk.hashCode());//10
        numk.add(20);
        System.out.println(numk.hashCode());//30
        //retainall metodu ==>iki set metodunu add yaptiginizda bir
        // setin elementlerini icinde silmek icin kullanir ve gidip o elementin elemanlarini bulunca true dondurur
    }
}
