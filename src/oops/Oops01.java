class Calculator {
    public int add(int a, int b) {
        int sum=a+b;
        return sum;
    }

    
}


public class Oops01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        Calculator c1 = new Calculator();
        int result = c1.add(num1 , num2);
        System.out.println("Result: " + result);

    }
}

