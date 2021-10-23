import acm.program.*;

public class MyProgram extends ConsoleProgram{
	public void run() {
		double b = readDouble("Enter b: ");
		double h = readDouble("Enter h: ");
		double a = (b*h)/2;
		println("a = " + a);
	}
}
