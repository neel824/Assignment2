
import java.util.Random;
import java.util.Scanner; 
public class test 
{
	public static void main(String[] args)
	{
		int randNum = RNG.rand();
		int lowGuess = 0;
		int highGuess = 100;
		Scanner input = new Scanner(System.in);
		
		
			System.out.println("Enter your first guess ");
			int nextGuess = input.nextInt();
		do
		{
			if (RNG.inputValidation(nextGuess, lowGuess, highGuess))
			{
				if(nextGuess > randNum)
				{
					highGuess = nextGuess;
					
					System.out.println("Number of guess is " + RNG.getCount());
					
					System.out.println("Your guess is too high");
					
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					
					nextGuess = input.nextInt();
				}
				else if (nextGuess < randNum)
				{
					lowGuess = nextGuess;
					System.out.println("Number of guess is " + RNG.getCount());
					
					System.out.println("Your guess is too high");
					
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					
					nextGuess = input.nextInt();
				}
				if(nextGuess >= lowGuess || nextGuess <= highGuess)
				{
					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					
					nextGuess=input.nextInt();
				}			
			}
		}while(nextGuess > randNum || nextGuess < randNum);			
	}		
}

