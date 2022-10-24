package lambda.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int d = calc.multiply.apply(a, b);
        int e = calc.pow.apply(b);
        int f = calc.abs.apply(b);
        int c = calc.devide2.apply(a, b);
        calc.println.accept(c);
        calc.println.accept(f);
        System.out.println("isPositive = " + calc.isPositive.test(b));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
