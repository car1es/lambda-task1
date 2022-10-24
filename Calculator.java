package lambda.task1;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //  Возникает ошибка деления на 0
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Деление на ноль!");
        }
    };

    BinaryOperator<Integer> devide2 = (x, y) -> {
        if (x > 0 && y > 0) {
            return x / y;
        } else {
            System.out.println("Деление на ноль");
            return 0;
        }
    };

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
