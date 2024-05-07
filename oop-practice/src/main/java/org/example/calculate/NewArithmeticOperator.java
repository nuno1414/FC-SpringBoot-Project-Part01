package org.example.calculate;

public interface NewArithmeticOperator {

    public boolean supports(String operator);
    public int calculate(int operand1, int operand2);
}
