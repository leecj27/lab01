import java.util.Scanner;

public class Lab01
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int counter = 3;
		int randomNumber = 5 + (int)(Math.random()*10); 

		while (counter != 0)
		{
			System.out.println("Try to guess the number between 0 
and 10! Guesses: " + counter);
			int guess=reader.nextInt();
			
			if (guess == randomNumber)
			{
				System.out.println("Winner!");
				counter = 0;
			}
			else 
			{
				System.out.println("Try Again.\n");
//				counter--;
			}
		}

	}
}

