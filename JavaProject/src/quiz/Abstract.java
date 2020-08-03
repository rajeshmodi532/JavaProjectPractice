package quiz;

public class Abstract {

	public interface IPrint{
		void printMe();
	}
	public class PrintTest implements IPrint
	{
		public void printMe()
		{
			System.out.println("Me");
		}
		public void main (String[] args)
		{
			PrintTest test = new PrintTest();
			test.printMe();
		}
	}

}
