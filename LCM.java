public class LCM {
    public static void main(String[] args) {
        // Define two numbers
        int num1 = 12;
        int num2 = 18;

        // Calculate LCM
        int lcm = findLCM(num1, num2);

        // Print the result
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to find the LCM of two numbers
    public static int findLCM(int a, int b) {
        // Find the GCD (Greatest Common Divisor)
        int gcd = findGCD(a, b);

        // LCM formula: LCM(a, b) = (a * b) / GCD(a, b)
        return (a * b) / gcd;
    }

    // Method to find the GCD (Greatest Common Divisor)
    public static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}

