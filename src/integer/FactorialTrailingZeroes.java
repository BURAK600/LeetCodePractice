package integer;

public class FactorialTrailingZeroes {

    public static int getFactorialTrailingZeroes(int n){
        if(n <5){
            return 0;
        }
        int temp = 1;
        for (int i = 1; i<=n;i++){
            temp = i*temp;
        }
        int x = 0;
        while(temp>=0){
            if(temp%5==0){
                System.out.println(temp);
                temp = temp/5;
                x++;
            }else{
                return x;
            }
        }
        return x;
    }


    public static int getFactorialTrailingZeroes2(int n){

        int count = 0;
        for (int i = 5; i<=n;i = i*5){
            count = count + n/i;
        }
       return count;
    }

    public static void main(String[] args) {
        System.out.println(getFactorialTrailingZeroes(11));
        System.out.println(getFactorialTrailingZeroes2(11));
    }
}
