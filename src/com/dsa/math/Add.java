package com.dsa.math;

public class Add {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Add calculator = new Add();
        
        int num1 = 15;
        int num2 = 7;
        int sum = calculator.getSum(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
