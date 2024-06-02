class Main 
   {
    public static void main(String[] args) 
     {
        int maxPalindrome = 0;

        for (int i = 100; i < 1000; i++)
          {
            for (int j = 100; j < 1000; j++) 
               {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome) 
                   {
                    maxPalindrome = product;
                }
            }
        }

        System.out.println("Largest palindrome made from the product of two 3-digit numbers: " + maxPalindrome);
    }

    public static boolean isPalindrome(int num)
       {
        int reversedNum = 0;
        int originalNum = num;

        while (num > 0) 
          {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
