package in.assignment3;
import java.util.Scanner;

class Guesser{
	int guessNum;
	public int guessNumber()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=sobj.nextInt();
		return guessNum;
	}
	int guessserAge;
	public int EnterGuesserAge()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Guesser kindly enter the age");
		guessserAge=sobj.nextInt();
		return guessserAge;
	}
	
	
}
class Player{
	int pguessNum;
	public int guessNumber()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		pguessNum=sobj.nextInt();
		return pguessNum;
	}
	
	int playerAge;
	public int EnterPlayerAge()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("plyer kindly enter the age");
		playerAge=sobj.nextInt();
		return playerAge;
	}
	
	
	
}
class Umpire{
	int numFromGuesser;
	int ageOfGuesser;

	int numFromPlayer1;
	int ageOfPlayer1;

	int numFromPlayer2;
	int ageOfPlayer2;

	int numFromPlayer3;
	int ageOfPlayer3;


	
	public void collectNumFormGuesser() {
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	public void collectAgeFromGuesser() {
		Guesser guesser=new Guesser();
		ageOfGuesser=guesser.EnterGuesserAge();
	}
	
	public void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();

		
	}
	public void collectAgeFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		ageOfPlayer1=p1.EnterPlayerAge();
		ageOfPlayer2=p2.EnterPlayerAge();
		ageOfPlayer3=p3.EnterPlayerAge();
		
	}
	
	
	void compare()
	{
		
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("There is a tie , all palyers has wright answer");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("player1 and player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 and player3 won the game");
			}
			else
			{
				System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		else {
			System.out.println("Game lost play again");
		}
	}	
	void compareAge()
	{
		if(ageOfGuesser<=10 || ageOfGuesser>20)
		{
			System.out.println("guesser is not eligible to play the game , hence dropped");
			
			if(ageOfPlayer1<=10 || ageOfPlayer1>20)
			{
				System.out.println("player1 is not eligible to play the game , hence dropped");
				
				if(ageOfPlayer2<=10 || ageOfPlayer2>20)
				{
					System.out.println("player2 is not eligible to play the game , hence dropped");
					
					if(ageOfPlayer3<=10 || ageOfPlayer3>20)
					{
						System.out.println("player3 is not eligible to play the game , hence dropped");
					}
				}
			}
			System.exit(0);
			
		}
		else if(ageOfPlayer1<=10 || ageOfPlayer1>20)
		{
			System.out.println("player1 is not eligible to play the game , hence dropped");
			
			if(ageOfPlayer2<=10 || ageOfPlayer2>20)
			{
				System.out.println("player2 is not eligible to play the game , hence dropped");
				
				if(ageOfPlayer3<=10 || ageOfPlayer3>20)
				{
					System.out.println("player3 is not eligible to play the game , hence dropped");
				}
			}
			System.exit(0);
		}
		else if(ageOfPlayer2<=10 || ageOfPlayer2>20)
		{
			System.out.println("player2 is not eligible to play the game , hence dropped");
			
			if(ageOfPlayer3<=10 || ageOfPlayer3>20)
			{
				System.out.println("player3 is not eligible to play the game , hence dropped");
			}
			System.exit(0);
		}
		else if(ageOfPlayer3<=10 || ageOfPlayer3>20)
		{
			System.out.println("player3 is not eligible to play the game , hence dropped");
			System.exit(0);
		}
		else {
			System.out.println("all the players are eligible to play the game");
		}
		
	}
}
public class Launchgame {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		
		u.collectNumFormGuesser();
		u.collectAgeFromGuesser();
		u.collectNumFromPlayer();
		u.collectAgeFromPlayer();
		u.compareAge();
		u.compare();

	}

}

