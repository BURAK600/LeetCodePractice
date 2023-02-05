package integer;

public class PowXN {

    public static double powXN(double x, int n ){
        double powerXN = 1;
        for (int i =0; i<n || i>-n;i++){
            powerXN = powerXN*x;
        }
        return powerXN;
    }

    public static double powXN2(double x, int n ){

        double ans = 1;
        while(n!=0){
            if(n%2==0){
                x = x*x;
                n = n/2;
            }else{
                ans = (ans*x);
                n = n-1;

            }
        }

        return ans;
    }



    public static void main(String[] args) {
        System.out.println(powXN(2.1,7));
    }




}
