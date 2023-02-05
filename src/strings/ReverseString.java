package strings;

public class ReverseString {

    public static char[] getReverseString(char[] s){

        int left =0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;

        }
        return s;
    }


    public static void main(String[] args) {

        char[] s =  {'b','u','r','a','k'};
        System.out.println(getReverseString(s));


    }
}
