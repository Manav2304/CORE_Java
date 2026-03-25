import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[ ] a = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("These are the numbers that entered by the user");
        for(int i=0; i<5 ; i++){
            System.out.println(a[i]);
        }
    }
}