package Calculator_simple.Calculator_simple;

/**
 * Hello world!
 *
 */
public class App 
{
	public static double sum(double a, double b) {
		return a + b;
	}

	public static double subtract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Can't divide by zero!");
		}
		return a / b;
	}
}
