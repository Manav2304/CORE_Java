public class Armstrong {
    public static void main(String[] args){
        int n =153;
        int a,sum=0;
        int temp=n;
        while(n>0) {
            a=n%10;
            n=n/10;
            sum=sum+a*a*a;
        }
        if (temp==sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
