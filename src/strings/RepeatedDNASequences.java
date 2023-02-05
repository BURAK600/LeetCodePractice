package strings;

import java.util.*;

public class RepeatedDNASequences {

    public static List<String> getRepeatedDNASequences(String s){

//        use hashmap!!!   time complexity = O(n) space complexity = O(n)
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0;i<=s.length()-10;i++) {
            String substring = s.substring(i, i + 10);
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> item: map.entrySet()){
            if(item.getValue()>1){
                list.add(item.getKey());
            }
        }
        return list;


    }


    public static List<String> getRepeatedDNASequences2(String s){

//        use hashset!!!   time complexity = O(n) space complexity = O(n)
        Set<String> set = new HashSet<>();
        Set<String> list = new HashSet<>();

        for(int i = 0;i<=s.length()-10;i++){
            String substring = s.substring(i,i+10);

            if(set.contains(substring)){
                list.add(substring);
            }else {
                set.add(substring);
            }
        }
        return new ArrayList<>(list);


    }

    public static void main(String[] args) {

        System.out.println(getRepeatedDNASequences2("AAAAACCCCCAAAAACCCCCAAAAAGGGTTT"));
    }
}
