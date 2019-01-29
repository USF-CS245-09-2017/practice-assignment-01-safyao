public class Fibonacci
{
	//Constructor
	//Designates which function to call based on type input.
	public int fibonacci (int n, String type)
	{
		if (type.equals("iterative"))
		{
			return fibonacci_iterative(n);
		}
		if (type.equals("recursive"))
		{
			return fibonacci_recursive(n);
		}
		else
		{
			return n;
		}
	}

	//Interative function that finds nth fibonacci number.
	public int fibonacci_iterative(int n)
	{
		int fib = 0;
		int first = 1;
		int second = 1;
		for (int i = 1; i <= n; i++)
		{
			if (i == 1 || i == 2)
			{
				fib = 1;
			}
			else
			{
				fib = first + second;
				first = second;
				second = fib;
			}
		}
		return fib;	
	}

	//Recursive function that finds nth fibonacci number.
	public int fibonacci_recursive(int n)
	{
		if (n == 0 || n == 1) 
		{
			return n;
		}
		else
		{
			return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
		}
	}
}

