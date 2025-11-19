import java.util.Scanner;

class PasswordReset
{
	public static void main(String[] args)
	{
		int attempt = 1;
		// Scanner sc = new Scanner(System.in);
		
		// String password = scanner.nextLine(); 		
		
		do
		{
			System.out.println("Password retrying: "+attempt);
			attempt++;
		}
		while(attempt <= 5);
		
		if(attempt > 5)
		{
			System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("Your account is block, please try again after 24 hrs...");
		}
	}
}
		