package integer;

public class PalindromeNumber {

    public static boolean isPalindromeNumber(int n){

        if(n<0 || (n!=0 && n%10 ==0)){
            return false;
        }
            int reverse = 0;

            while(n>reverse){
                int lastDigit = n%10;
                reverse = reverse*10 +lastDigit;
                n = n/10;
            }


return  n ==reverse/10 || n == reverse? true:false;


    }

    public static void main(String[] args) {

        System.out.println( isPalindromeNumber(12321));

    }
}
