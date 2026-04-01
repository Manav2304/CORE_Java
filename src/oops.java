public class oops {
    static public void main(String ... args){
        Abc obj = new Abc(5);


    }
}

//below exaample state that constructor overloading
class Abc{
    public Abc()
    {
        System.out.println(" In Abc constructor");
    }
    public Abc(int a ){
        System.out.println(" In Abc constructor with parameter ");

    }
}
