package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {



        Map<String,Integer> harfMap=new HashMap<>();

        harfMap.put("A",5);
        harfMap.put("B",1);
        harfMap.put("C",2);
        harfMap.put("D",4);
        harfMap.put("E",4);

        System.out.println(harfMap);


        harfMap.compute("A",(k,v) -> v*2+3);
        harfMap.compute("D",(a,b) -> b*b);
        harfMap.computeIfAbsent("C",(v) ->30 );
        harfMap.computeIfAbsent("F",(v) ->30 );
        harfMap.computeIfPresent("E",(k,v) ->v+5);//E 9
        harfMap.computeIfPresent("G",(k,v) ->v+5);//hicbirsey yapmiyor varsa degistiriyor

        System.out.println(harfMap);
    }
}
