package printf;

public class C03Marketproject {
    public static void main(String[] args) {
        String product[] = {"Domates", "biber", "patlican"};
        double brprice[] = {2.3, 2.5, 3};
        double kg[] = {1, 2, 3.5};

        System.out.println("  product  kg    price  total");
        System.out.println("================================");
        for (int i = 0; i < product.length; i++) {
            System.out.printf("%-8s  %05.2fkg   $%05.2f\n", product[i], kg[i], brprice[i]);

        }
        System.out.println("=================================");
        double total = 0;
        for (int i = 0; i < kg.length; i++) {
            total += kg[i];

        }
        double totalprice = 0;
        for (int i = 0; i < kg.length; i++) {
            totalprice += brprice[i] * kg[i];
        }
        System.out.printf("Genet Toplam  %5.2fkg  %5.2f$ ", total, totalprice);
        /*
          product  kg    price  total
================================
Domates   01,00kg   $02,30
biber     02,00kg   $02,50
patlican  03,50kg   $03,00
=================================
Genet Toplam   6,50kg  17,80$
         */
    }
}
