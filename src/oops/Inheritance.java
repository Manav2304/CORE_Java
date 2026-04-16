package oops;
/*first of all we have three types of inheritance
1) single level
2) multi level
3) multiple level
But make sure java don't support multiple level
 */
/*
Also we do have three different names
A       ->parent (or)-> super -> base
^
|
|
B       ->child  (or) ->sub (or) -> derived
 */
public class Inheritance {
    public static void main(String[] args){
        MulSubAdd obj = new MulSubAdd();

obj.num1=5;
obj.num2=10;
obj.sum();
        System.out.println(obj.result);

obj.sub();
System.out.println(obj.result);
        obj.multi();
        System.out.println(obj.result);

    }
}
class Add
{
    int num1,num2,result;
    public void sum()
    {
        result=num1+num2;
    }
}
class SubAdd extends Add  //single level inheritance
{

    public void sub(){
      result = num1-num2;
    }
}

class MulSubAdd extends SubAdd{//multi-level Inheritance

    public void multi(){
        result=num1*num2;
    }
}
