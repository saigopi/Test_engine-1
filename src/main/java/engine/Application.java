package engine;


import engine.calculator.Calculator;

public class Application {

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sayHello());
    }
}
