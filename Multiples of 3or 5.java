class SumOfMultiples 
  {
    public static void main(String[] args) 
       {
        int limit = 1000;
        int sum = 0;

        for (int i = 1; i < limit; i++)
           {  
            if (i % 3 == 0 || i % 5 == 0)
                {     
                sum += i;
               }
             }

        System.out.println("The sum of all multiples of 3 or 5 below " + limit + " is: " + sum);
    }
}
