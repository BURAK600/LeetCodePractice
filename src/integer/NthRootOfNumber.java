package integer;

public class NthRootOfNumber {

//    Binary search
    public static double getNthRootOfNumber(int x, int y){

   double ans = 0;
   double left = 1;
   double right = x;
   double error = 0.001;

   while((right-left)>error ){
      double mid = (left+right)/2;
       System.out.println("mid" + mid);
       double temp2 = 1;

       for (int i  =0; i<y; i++){
           temp2 *=mid;
           System.out.println("temp2" +temp2);

       }
       if(temp2>x){
           right = mid;
       }else{
           left = mid;
       }
   }
   return right;
    }

    public static void main(String[] args) {
        System.out.println(getNthRootOfNumber(4,2));
    }
}
