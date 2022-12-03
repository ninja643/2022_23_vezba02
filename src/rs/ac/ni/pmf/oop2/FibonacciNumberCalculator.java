package rs.ac.ni.pmf.oop2;

import com.google.common.math.BigIntegerMath;

public class FibonacciNumberCalculator
{
	private int computeFibonacciNumber(int n)
	{
		if (n < 1)
		{
			return 0;
		}

		if (n == 1)
		{
			return 1;
		}

		return computeFibonacciNumber(n - 1) + computeFibonacciNumber(n - 2);
	}

	public static void main(String[] args)
	{
//		System.out.println("Number od arguments: " + args.length);
//		for (final String argument : args)
//		{
//			System.out.println(argument);
//		}

//		if (args.length != 1)
//		{
//			System.out.println("Error! Exactly one integer parameter is expected.");
//			return;
//		}
//		final int n = Integer.parseInt(args[0]);
//		final FibonacciNumberCalculator fibonacciNumberCalculator = new FibonacciNumberCalculator();
//		System.out.println(fibonacciNumberCalculator.computeFibonacciNumber(n));

		System.out.println(BigIntegerMath.binomial(10, 2));
	}
}
