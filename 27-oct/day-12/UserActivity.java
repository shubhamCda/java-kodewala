class UserAdminActivity
{
	public static void main(String[] args)
	{
		String role = args[0];
		
		switch(role)
		{
			case "user" :
				System.out.println("You are an USER you are allowed to fetch your own details.");
				break;
				
			case "admin" :
				System.out.println("You are an ADMIN you are allowed to fetch your own and others details.");
				break;
				
			case "superadmin" :
				System.out.println("You are an SUPER-ADMIN you are allowed to MODIFY others details.");
				break;
				
			default:
				System.out.println("Authorize users only XXXXXX");
		}
	}
}