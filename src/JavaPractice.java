import java.util.*;

public class JavaPractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("1: Rock ");
		System.out.println("2: Paper ");
		System.out.println("3: Scissor ");

		System.out.print("Choose number: " );
			
		try {
			int input = in.nextInt();
			int opponent = (int)(Math.random()*3)+1;
			
			switch (input) {
			case 1:
				System.out.println("You choose Rock " );
				if(opponent == 1) {
					System.out.println("Opponent: Rock " );
					System.out.println("Draw");
				}
				else if(opponent == 2) {
					System.out.println("Opponent: Paper " );
					System.out.println("You Lose");
				}
				else {
					System.out.println("Opponent: Scissor " );
					System.out.println("You Win");
				}
				break;
				
			case 2:
				System.out.println("You choose Paper " );
				if(opponent == 2) {
					System.out.println("Opponent: Paper " );
					System.out.println("Draw");
				}
				else if(opponent == 3) {
					System.out.println("Opponent: Scissor " );
					System.out.println("You Lose");
				}
				else {
					System.out.println("Opponent: Rock " );
					System.out.println("You Win");
				}
				
				break;
			case 3:
				System.out.println("You choose Scissor " );
				if(opponent == 3) {
					System.out.println("Opponent: Scissor " );
					System.out.println("Draw");
				}
				else if(opponent == 1) {
					System.out.println("Opponent: Rock " );
					System.out.println("You Lose");
				}
				else {
					System.out.println("Opponent: Paper " );
					System.out.println("You Win");
				}
				break;
				
			default:
				System.out.println("invalid input, please just choose a number available at the top ");
				break;
			
			}
		} catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
		
	}

}
