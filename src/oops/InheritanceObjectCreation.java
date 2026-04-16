package oops;

public class InheritanceObjectCreation {
    public static void main(String[] args){
//        A obj = new A();
//                A obj = new A(5);

//        B obj = new B();
        B obj = new B(5);

    }
}

class A {
    public A(){
        System.out.println("in A Constructor");
    }
    public A(int i){
        System.out.println("Constructor int A");
    }
}
class B extends A{
    public B(){
        System.out.println("in B Constructor");

    }
    public B(int i){
        System.out.println("Constructor int B");
    }
}

/*

Here we are called first constructor from A method and we got
In a constructor
if we pass 5 in A constructor it will return constructor int a

when we called B constructor without passing any parameter it will return
In a constructor along with In B constructor
Because by default it will called super(); class as well.

when we are pass integer in B and B Inherit with A
so it will return In a constructor first
and then constructor int B
 */