public class swapping {
    public static void main(String[] args) {
        //there are three ways to swap numbers
        //1
        int a=5; //0101
        int b=10;//1010
        System.out.println("before swap a is " + a + " and  b is "+ b);

//        int temp;
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println( "now a is " + a + " and  b is "+ b);
        //2
/*
        a=a+b;//15
        b=a-b;//15-10 = 5
        a=a-b;//15-5=10
        System.out.println("after swap a = " + a + "and b =" + b);
*/   //^ means XOR operation
//        a=a^b;//
//        b=a^b;//
//        a=a^b;//
        //3  rd and easiest way for swapping numbers
        b= a + b - (a=b);
        System.out.println("after swap a = " + a + "and b =" + b);

    }
    }
