public class oopsbasic {
    static public void main(String ... args){
        Abc obj = new Abc(5);


    }
}

//below example state that constructor overloading
class Abc{
    public Abc()
    {
        System.out.println(" In Abc constructor");
    }
    public Abc(int a ){
        System.out.println(" In Abc constructor with int ");

    }
    public Abc(double a ){
        System.out.println(" In Abc constructor with double ");

    }
}
