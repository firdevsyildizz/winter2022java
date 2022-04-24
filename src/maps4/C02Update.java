package maps4;

import maps.CreateMap;

import java.util.Map;
import java.util.Set;

public class C02Update {
    // Verilen map'deki tum branslari Java yapalim
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= CreateMap.myMap();
        System.out.println(sinifListMap);
        Set<Map.Entry<Integer,String>> sinifEntrySet= sinifListMap.entrySet();
        for (Map.Entry<Integer,String> each: sinifEntrySet
        ) {
            Integer keyEntry=each.getKey();
            String valueEntry= each.getValue();
            String valueArr[]= valueEntry.split(", ");
            valueArr[2]="Java";
            String valueYeni= valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", "
                    + valueArr[3];
            sinifListMap.put(keyEntry,valueYeni);
        }
        System.out.println(sinifListMap);
    }
}
