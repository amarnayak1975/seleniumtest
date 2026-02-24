package junitexamples;


public class TestPrime
{
	public static boolean isPrime(long n)
    {
        for (long val = 2; val * val <= n; val++)
        {
            if (n % val == 0)
            {
                return false;
            }
        }
        return n > 1;
    }
    // function to check the given number is even
    public static boolean isEven(long n)
    {
        return !((n & 1) == 1);
    }
}
