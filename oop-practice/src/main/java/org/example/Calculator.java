package org.example;

import org.example.calculate.*;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculator(int operand1, String operator, int operand2) {

//        if (operator.equals("+")) {
//            return operand1 + operand2;
//        } else if (operator.equals("-")) {
//            return operand1 - operand2;
//        } else if (operator.equals("*")) {
//            return operand1 * operand2;
//        } else if (operator.equals("/")) {
//            return operand1 / operand2;
//        }

        //return ArithmeticOperator.calculate(operand1, operator, operand2);

        return arithmeticOperators.stream()
                .filter(arithmeticOperators -> arithmeticOperators.supports(operator))
                .map(arithmeticOperators -> arithmeticOperators.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
