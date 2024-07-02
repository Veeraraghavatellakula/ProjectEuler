public class TriangleNumberDivisors {
    public static void main(String[] args) {
        int num = 1;
        int triangleNumber = 0;
        while (true) {
            triangleNumber += num;
            num++;
            if (countDivisors(triangleNumber) > 500) {
                System.out.println("The first triangle number with over 500 divisors is: " + triangleNumber);
                break;
            }
        }
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        if (Math.sqrt(n) == (int) Math.sqrt(n)) {
            count--;
        }
        return count;
    }
}
