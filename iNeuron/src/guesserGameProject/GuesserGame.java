package guesserGameProject;
import java.util.*;

class Gusser{
	int guessNum;
	int guessNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Kindly Guess The Number : ");
		guessNum = sc.nextInt();
		return guessNum;
	}
}
class Player{
	int guessNum;
	int guessNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Kindly Guess The Number : ");
		guessNum = sc.nextInt();
		return guessNum;
	}
}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser(){
		Gusser g = new Gusser();
		numFromGuesser = g.guessNumber();
	}
	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("Game Tied..");
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Player 1 and Player 2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 1 and Player 3 won the game");
			}
			else {
				System.out.println("Player 1 is won the game");
			}
		
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 2 and Player 3 won the game");
			}
			else {
				System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		else {
			System.out.println("No One wins ,Try again");
		}
	}
}
public class GuesserGame {
    public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
