import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int[ ] a = new int[5];
//        System.out.println("Enter 5 numbers");
//        for(int i=0;i<5;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("These are the numbers that entered by the user");
//        for(int i=0; i<5 ; i++){
//            System.out.println(a[i]);
//        }
//        ForEnhanced.show();
//        length.LENGTH();
        RandomValues.RandomClass();
    }
}
//this is the example in which I have created one more class for the enhanced for loop
class ForEnhanced{
    public static void show(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers");

        int[] a= new int[5];
        for (int i=0; i <5; i++ ){
            a[i] = sc.nextInt();
        }
            System.out.println("numbers");
        //below for loop is the enhanced for loop
        for (int i : a){
            System.out.println(i);
        }
    }
}

class length{
    public static void LENGTH(){
    int[] a= new int[20];
    for (int i=0; i<a.length; i++){
        a[i]=i+1;
    }
    for (int i : a){

        System.out.println(i);
    }
    }
}

class RandomValues{
    public static void RandomClass(){
        Random r = new Random();
        int[] a = new int[20];
        for (int i = 0 ; i < a.length; i++){
            a[i] = r.nextInt(50);

        }
        for(int i : a){
            System.out.println(i);
        }
    }
}