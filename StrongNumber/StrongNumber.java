public class StrongNumber {
    public static void main(String cp[]) {

        int num = Integer.parseInt(cp[0]);
        System.out.println("Num = " + num);

        int original = num;
        int sum = 0;

        while (original > 0) {
            int digit = original % 10;
            int fact = 1;

            // Find factorial of the digit
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
                System.out.println("Fact in = " + fact);
            }

            System.out.println("Fact = " + fact);

            sum += fact;
            System.out.println("Sum = " + sum);

            original = original / 10;
        }

        if (sum == num) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not strong number");
        }
    }
}