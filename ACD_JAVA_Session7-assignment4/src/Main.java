import java.util.Scanner;

public class Main {

	private static char c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			String s=null;
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter a value");
			s=ob.next();
			System.out.println("the length of the string"+ s.length());
			c = s.charAt(0);
			c=s.charAt(40);
			
			 System.out.println(c);

		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("this is a StringIndexOutOfBoundsException!!");
			
		}
		
		
		
	}

}
	
	
	
	

