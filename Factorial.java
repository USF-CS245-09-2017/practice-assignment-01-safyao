public class Factorial
{
	
	//Constructor
	//Designates function call based on type input.
	public int factorial (int n, String type)
	{
		if (type.equals("iterative"))
		{
			return factorial_iterative(n);
		}
		if (type.equals("recursive"))
		{
			return factorial_recursive(n);
		}
		else
		{
			return n;
		}	
	}

	//Iterative function that finds n!
	public int factorial_iterative(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			int factorial = 1;
			for (int i = 1; i <= n; i++)
			{
				factorial = factorial * i;
			}
			return factorial;
		}
	}

	//Recursive function that finds n!
	public int factorial_recursive(int n)
	{
		if (n == 0 || n == 1)
		{
			return 1;
		}
		return n * factorial_recursive(n - 1);
	}
}

