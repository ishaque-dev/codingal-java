public class LessonTwo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        int div = a / b;
        int squareA = a * a;
        int squareB = b * b;

        String magic = "==========Magic========";

        System.out.println("====Method 1========");
        System.out.println("Addition of a&b: " + sum);
        System.out.println("Subtraction of a&b: " + diff);
        System.out.println("Multiplication of a&b: " + mult);
        System.out.println("Division of a&b: " + div);
        System.out.println("Square of a: " + squareA);
        System.out.println("Square of b: " + squareB);
        System.out.println("====Method 2========");
        System.out.println("Addition of a&b: " + (a + b));
        System.out.println("Subtraction of a&b: " + (a - b));
        System.out.println("Multiplication of a&b: " + (a * b));
        System.out.println("Division of a&b: " + (a / b));
        System.out.println("Remainder : " + (a % b));
        System.out.println("Square of a: " + (a * a));
        System.out.println("Square of b: " + (b * b));

        System.out.println(magic);

        System.out.println(
                "Addition: " + (a + b) +
                        " Subtraction: " + (a - b) +
                        " Multiplication: " + (a * b) +
                        " Division: " + (a / b));
    }
}