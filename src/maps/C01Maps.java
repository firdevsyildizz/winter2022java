package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01Maps {
    public static void main(String[] args) {
        // javada collection uyesi bir bir yapida data turu object secilirse ,her data
        //tururnden deger ekleyebilirsiniz ancak bu durumda surekli casting problemleri ile karsilasiriz

        List<Object> list=new ArrayList<>();
        list.add("engin");
        list.add(15);
        list.add(10.5);


        System.out.println(list);
        list.set(1,(Integer)(list.get(1))+10);

        Map<Integer,String>sinifList=new HashMap<>();
        //bir sinifta ogrenci no ve isim ,brans olarak map olusturmak istiyoruz
        // key tek bir unique degerdir
        //ama value deger birde fazla bilginin birlesmasinden olusur
        //bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmik icin tum elementler icin value ayni bicimde olusturulabilir
        //veri siralamasi ve sekil acisindan =>ogrenci dosyasi tek tek olusturmak gibi
        sinifList.put(101,"ali,can,dev");
        sinifList.put(102,"veli,yan,qa");
        sinifList.put(103,"omer,yildiz,dev");//101 burda key dosyanin numasi gibi unique digerleri value bilgiler gibi
        System.out.println(sinifList);
        System.out.println(sinifList.keySet()); //key numaralarini verir
        System.out.println(sinifList.values());//degerleri yazdirir
        System.out.println(sinifList.containsValue("ali,can,dev"));

    }
}
