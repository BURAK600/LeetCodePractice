package integer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * solve this problem using hashset data structure
 */
public class SingleNumber {

    public static int singleNumber(int[] array){

        if(array.length ==1){
            return array[0];
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<array.length;i++){
            if(set.contains(array[i])){
                set.remove(array[i]);
            }else {
                set.add(array[i]);
            }
        }
        return set.iterator().next();
    }
    public static void main(String[] args) {

        int[] answer = {3,2,2,1,1,4,4};
        System.out.println(singleNumber(answer));


//        Set<Integer> set = new HashSet<>();
//
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.stream().forEach(System.out::println);


        System.out.println(4^1);  // 4+1 = 5
        System.out.println(4^4); // => 0
        System.out.println(4^0); // => 4+0 =
        System.out.println(1^3); // => 3-1 = 2


    }
}
