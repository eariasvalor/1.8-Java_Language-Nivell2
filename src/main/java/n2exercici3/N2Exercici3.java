package n2exercici3;

public class N2Exercici3 {
    public static void main(String[] args){
        IOperation addition = (n1, n2) -> n1 + n2;
        IOperation substraction = (n1, n2) -> n1 - n2;
        IOperation multiplication = (n1, n2) -> n1 * n2;
        IOperation division = (n1, n2) -> n1 / n2;

        float number1 = 25f;
        float number2 = 12f;

        System.out.println("Addition: " + addition.operation(number1, number2));
        System.out.println("Substraction: " + substraction.operation(number1, number2));
        System.out.println("Multiplication: " + multiplication.operation(number1, number2));
        System.out.println("(Joy)Division: " + division.operation(number1, number2));

    }
}
