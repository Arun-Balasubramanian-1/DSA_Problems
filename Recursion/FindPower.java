public class FindPower {
  
  public static double myPow(double x, int n) {
      
      if(n==0){
        return 1;
      }else if(n==1){
        return x;
      }else if(n < 0){
        return 1 / myPow(x, n * -1);
      }

      return x * myPow(x, n-1);
  }

  public static void main(String[] args){

    int x = 2;
    int[] powers = {-4, 0, 1, 6};

    for(int power: powers){
      System.out.println(x + " to the power " + power + " is " + myPow(x, power));
    }
    
  }
}
