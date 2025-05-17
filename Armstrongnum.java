public class Armstrongnum {
  public static void main(String[] args) {
    int num=1634;
    int temp=num;
    int sum=0;
    while(num>0){
      int res=num%10;
      int four=res*res*res*res;
      sum+=four;
      num=num/10;
    }
    if(temp==sum){
      System.out.println("it is a armstrong number");
    }
    else {
      System.out.println("It is not a armstrong number");
    }
  }
}