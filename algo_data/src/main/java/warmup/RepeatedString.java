package warmup;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class RepeatedString {
    public long findResult(String s, long n){
        long sSize = s.length();
//        Map<Character, Long> resMap = new HashMap<>();
        long th = n/sSize;
//        Character bigKey = s.charAt(0);
//        Long bigV=0L;
//
//        for (int i=0;i<sSize;i++){
//            Character k = s.charAt(i);
//            if (resMap.containsKey(k)){
//                Long x = resMap.get(k);
//                resMap.put(k,++x);
//                if(x > bigV){
//                    bigKey = k;
//                    bigV = x;
//                }
//            }else{
//                resMap.put(s.charAt(i), 1L);
//            }
//        }
//
//        for (Map.Entry<Character, Long> res: resMap.entrySet()){
//            Long value = res.getValue();
//            res.setValue(value*th);
//        }
//
//        for (int k=0;k<(n-(sSize*th));k++){
//            Character ka = s.charAt(k);
//            Long x = resMap.get(ka);
//            resMap.put(ka,++x);
//        }
//
//        Gson gson = new Gson();
//        System.out.println("Test: "+gson.toJson(resMap));
//        System.out.println("Test2: "+resMap.get(bigKey));

        long count =0;
        for (int k=0;k<sSize;k++){
            Character ka = s.charAt(k);
            if(ka.equals('a')){
                count++;
            }
        }

        count = count*th;

        for (int k=0;k<(n-(th*sSize));k++){
            Character ka = s.charAt(k);
            if(ka.equals('a')){
                count++;
            }
        }

    System.out.println("Result: "+count);
        return 0;
    }
}
