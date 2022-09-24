import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {
	public static void main(String args[]) {
		String anotherQuestion = "Yes";

		//Loop so the user can keep asking questions
		while (anotherQuestion.equalsIgnoreCase("Yes")) {
			
			//Allow the user to input question
			Scanner scnr = new Scanner(System.in);
			
			//Ask for Question
			System.out.println("What is your question? ");
			String question = scnr.nextLine();
			
			//Magic 8 Ball Answers
			String rand1 = "It is certain";
			String rand2 = "It is decidedly so";
			String rand3 = "Without a doubt";
			String rand4 = "Yes - definitely";
			String rand5 = "You may rely on it";
			String rand6 = "As I see it, yes";
			String rand7 = "Most likely";
			String rand8 = "Outlook good";
			String rand9 = "Yes";
			String rand10 = "Signs point to yes";
			String rand11 = "Reply hazy, try again";
			String rand12 = "Ask again later";
			String rand13 = "Better not tell you now";
			String rand14 = "Cannot predict now";
			String rand15 = "Concentrate and ask again";
			String rand16 = "Don't count on it";
			String rand17 = "My reply is no";
			String rand18 = "My sources say no";
			String rand19 = "Outlook not so good";
			String rand20 = "Very doubtful";
			
			//Random number generator
			Random rand = new Random();
			int randNum;
			randNum = rand.nextInt(20);
			
			switch(randNum) {
			
				case 1:
					System.out.println(rand1);
					break;
			
				case 2:
					System.out.println(rand2);
					break;
				
				case 3:
					System.out.println(rand3);
					break;
				
				case 4:
					System.out.println(rand4);
					break;
				
				case 5:
					System.out.println(rand5);
					break;
				
				case 6:
					System.out.println(rand6);
					break;
				
				case 7:
					System.out.println(rand7);
					break;
				
				case 8:
					System.out.println(rand8);
					break;
				
				case 9:
					System.out.println(rand9);
					break;
				
				case 10:
					System.out.println(rand10);
					break;
				
				case 11:
					System.out.println(rand11);
					break;
				
				case 12:
					System.out.println(rand12);
					break;
				
				case 13:
					System.out.println(rand13);
					break;
				
				case 14:
					System.out.println(rand14);
					break;
				
				case 15:
					System.out.println(rand15);
					break;
				
				case 16:
					System.out.println(rand16);
					break;
				
				case 17:
					System.out.println(rand17);
					break;
				
				case 18:
					System.out.println(rand18);
					break;
				
				case 19:
					System.out.println(rand19);
					break;
				
				case 20:
					System.out.println(rand20);
					break;
			}
			//Ask if the user has another question and loop if Yes
			System.out.println("Do you have another question? Yes or No");
			anotherQuestion = scnr.nextLine();
			scnr.close();
		}
		
		// If-else statement in case the user puts an invalid answer
		if (!(anotherQuestion.equalsIgnoreCase("No"))) {
			System.out.println("Please run this again and try using Yes or No next time");
		} else {
		System.out.println("Thank you for using Magic 8 Ball!");
		}
	} 
}
