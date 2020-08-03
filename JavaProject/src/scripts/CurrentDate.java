package scripts;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class CurrentDate extends OverRiding {
	//public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/yyyy"); Date D = new
	 * Date(); System.out.println(SDF.format(D));
	 */


	public int plusMethodInt(int x, int y,int z) {
		return x + y;
	}


	public int plusMethodInt(int x, int y) { return x + y; }

	@Test(groups={"Smoke"})
	public static void main(String[] args) {
		CurrentDate obj=(CurrentDate) new OverRiding();
		int y= obj.plusMethodInt(10, 6);
		int z=obj.plusMethodInt(10,6,5);
		System.out.println("int: " + y);
		System.out.println("int: " + z);

		/*
		 * int myNum1 = plusMethodInt(8, 5); double myNum2 = plusMethodInt(4.3, 6.26);
		 * System.out.println("int: " + myNum1); System.out.println("double: " +
		 * myNum2);
		 */
	}

}

