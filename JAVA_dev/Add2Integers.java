import acm.program.*;

public class Add2Integers extends DialogProgram{
	public void run(){
		println("THis program adds tow integers. ");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int Total = n1+n2;
		println("The Total is " + Total + ".");
	}
}
