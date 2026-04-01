import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String ... args) {

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
//        RandomValues.RandomClass();
//        Arraytwodimenstional.Arraytwodimentional();
//        EnhancedForLoop.EnhancedFor();
//        JaggedArray.Jaggedarray();
//        multiArray.mutliDimentionalArray();

        Display obj = new Display();
        obj.show(5);

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
        int[] a = new int[10];

        for (int i = 0 ; i < a.length; i++){
            a[i] = r.nextInt(50);

        }
        try {
            System.out.println(a[52]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximun index is 49");
        }
        for(int i : a){
            System.out.println(i);
        }
    }
}

class Arraytwodimenstional{
    public static void Arraytwodimentional(){
        int a=5,b=6,c=7,d=8;
        int x[] = {5,6,7,8};
        int y[] = {6,7,8,9};
        int z[] = {9,8,7,6};
        int p[][] = {
                {5,6,7,8},
                {6,7,8,9},
                {9,8,7,6}
        };
        for (int i= 0; i<3;i++){
            for(int j=0; j<4; j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}

class EnhancedForLoop{
    public static void EnhancedFor(){
        int[] nums= new int[10];
        Random r=new Random();
        for (int i = 0 ; i<10; i++){
            nums[i] = r.nextInt(50);
        }
        for (int n : nums){
            System.out.println(n);
        }
    }
}
class EnhancedForLoopfortwoDarray{
    public static void EnhancedFor(){
        int[] nums= new int[10];
        Random r=new Random();
        for (int i = 0 ; i<10; i++){
            nums[i] = r.nextInt(50);
        }
        for (int n : nums){
            System.out.println(n);
        }
    }
}
class JaggedArray{
    public static void Jaggedarray(){
        int a=5, b=6,c=7,d=8;
        int[] x = {5,6,7,8};
        int[] y = {6,7};
        int[] z = {9,8,7};
        int[][] p ={
                {5,6,7,8},
                {6,7},
                {9,8,7}
        };
    for (int i[]:p){
        for (int j:i){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
}
class multiArray{
    public static void mutliDimentionalArray(){
        int[][][] a= new int [1][2][3];
        for (int i =0; i<1; i++){
             for(int j=0; j<2; j++){
                for(int k=0; k<3;k++){
                    a [i][j][k]  = i+j+k;
                }
             }
        }
//        for (int i =0; i<1; i++){
//            for(int j=0; j<2; j++){
//                for(int k=0; k<3;k++){
//                    System.out.print(" "+a[i][j][k]);
//                }
//            }
//        }
        for(int i[][] :a) {
            for(int j[]:i){
                for(int k:j){
                    System.out.print(" " + k);
                }
            }
        }

    }
}


class Display{
    public void show(int ... a ){
        for(int i : a) {
            System.out.println(i);
        }
    }
    public void show(int a ){
        System.out.println(a + "in show a ");
    }
}