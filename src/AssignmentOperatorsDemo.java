//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Assignment Name: GLAB - 303.2.1 - Core Java: Operators
Author: Pavlenko Anna
Data: 3/15/2024
 */


public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
/*
Example: Assignment Operators
 */
        //   Assigning Primitive Values
        int j, k;
        j = 10; // j gets the value 10.
        j = 5; // j gets the value 5. The previous value is overwritten.
        k = j; // k gets the value 5.
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        //  Multiple Assignments
        k = j = 10; // (k = (j = 10))
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        // Compound assignment operators:
        int x = 7;
        int y = 5;

        x += y;
        System.out.println("x is :" + x);

        x -= y;
        System.out.println("x is :" + x);

        x *= y;
        System.out.println("x is :" + x);

        x /= y;
        System.out.println("x is :" + x);

        x %= y;
        System.out.println("x is :" + x);
    }

}