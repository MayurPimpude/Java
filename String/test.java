import java.io.Bufferedreader;
import java.io.InputStreamReader;
import java.io.IOException;
class test
{	public static void main(String arg[])throws IOException
	{	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	 	System.out.print("Enter name: ");
		String name=reader.readLine();
		System.out.print("Enter age: ");
		String try1=reader.readLine();
		int age = Integer.parseInt(try1);
	}
}