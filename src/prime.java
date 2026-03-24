import java.util.Scanner;
public class prime {
    public static void main(String[] args){
//        int n=4;
        System.out.println("enter you number");
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime=true;
//       for(int i=2; i<n/2;i++){
//           if(n%i==0) {
//               isPrime=false;
//               break;
//           }
//
//       }
//        for(int i=2; i<Math.sqrt(n);i++){
//            if(n%i==0) {
//                isPrime=false;
//                break;
//            }
//
//        }
        for(int i=2; i<n;i++){
            if(n%i==0) {
                isPrime=false;
                break;
            }

        }
       if(isPrime){
           System.out.println(n + " is a prime number");
       }
       else{
           System.out.println(n + " is not a prime number");

       }

    }
}
