public class Hello
{
	public static void main(string[] arg)
	{
		string name = "World";
		if(arg.length != 0)
		{
			name = arg[0];
		}
		
		System.out.println("Hello, " + name + "!");	
	}
}