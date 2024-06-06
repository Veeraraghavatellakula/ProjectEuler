class prime
{
  public static void main(String[] args) {
   int count = 0;
   int num = 2; 
 while (count < 10001) {
   if (isPrime(num)) 
     {
    count++;
  if (count == 10001)
    {
   System.out.println("The 10001st prime number is: " + num);
    break;
        }
      }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
            }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
