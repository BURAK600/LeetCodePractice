package integer;

public class ReverseInteger {

    public static int reverseInteger(int number){
        int temp  = number;
        int temp2 = number;

        int reverseNumber =0;
        int remainder = 0;
        int n = 1;

        while(temp2>10 || temp2<-10){
            temp2 = temp2/10;
            n *= 10;
            System.out.println(n);

        }
        if (number>Math.pow(2,32)-1||number<-Math.pow(2,32)){
            return 0;
        } else if (number<10){
            return number;
        }else {
            while (number>0){
               remainder = number%10;
                System.out.println("remainder" + remainder);
               number  = number/10;
                System.out.println("number" + number);
               reverseNumber += n*remainder;
               System.out.println("n" +n);
               n = n/10;
            }
        }
        return temp  > 0 ? reverseNumber: -reverseNumber;
    }




    public static void main(String[] args) {
        System.out.println(reverseInteger(-1235555));
    }


}
