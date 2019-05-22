package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){

        Math math = new Math();

        math.addition(4566, 9876);
        math.subtraction(10998, 5213);
        math.multipy(1234, 5678);
        math.divide(50, 2);
        math.addition(-17, -90);
        math.subtraction(176, -94);
        math.multipy(333, -333);
        math.divide(12, -1);

        math.count("Caca da nu  2spatii   3spatii");
    }
}