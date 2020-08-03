package practice.java;

public class InstanceVariable {
	int PuppyAge;

	public void SetAge(int age)
	{
		PuppyAge = age;
	}
	public InstanceVariable (String con)
	{
		System.out.println("Default constructor: "+con);
	}
	public int GetAge()
	{
		System.out.println("Puppy age: "+PuppyAge);
		return PuppyAge;
	}

	public static void main(String[] args) {

		InstanceVariable InstVar = new InstanceVariable("Puppy");
		InstVar.SetAge(5);
		InstVar.GetAge();

		System.out.println("Puppy age: "+InstVar.PuppyAge);
	}
}