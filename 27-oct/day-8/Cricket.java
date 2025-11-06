class Cricket
{
	int score = 100; //instance variable
	private int run = 120;
	public int wickets = 3;
	
	
	public void play()
	{
		Cricket cricket = new Cricket();
		
		System.out.println("Score: "+cricket.score);
	}
	
	public static void main(String[] args)
	{
		Cricket cricket = new Cricket();
		cricket.play();
		
		System.out.println("Run: "+cricket.run);
		System.out.println("Wickets: "+cricket.wickets);
	}
}