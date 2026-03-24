import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
//     int a=1,b=1,c=0;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter your number");
//     int n= sc.nextInt();
//     System.out.print("1 1 ");
//     while(c<=n){
//         c=a+b;
//         System.out.print(c + " ");
//         a=b;
//         b=c;
//     }
//    }
        int a=0, b=1, n=10;
        for (int i = 1; i <= 10; i++) {
            System.out.print( a + " ");
            int next=a+b;
            a=b;
            b=next;

        }
    }
}

//0 1 1 2 3 5 8 13....