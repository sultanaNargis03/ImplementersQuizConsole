package com.telusko.app.main;

import java.util.Scanner;

import com.telusko.app.service.QuizService;

public class LaunchQuiz 
{
	public static void main(String[] args)
	{
		
		System.out.println("Let's play Quiz");

		System.out.println();
		System.out.println("***************************************");
		System.out.println("Game Instruction");
		System.out.println("For each wrong answer -1");
		System.out.println("For each correct answer +2");
		System.out.println("For each skip no marks");
		System.out.println("***************************************");
		System.out.println();
		boolean valid=false;
		
		do {
			System.out.println("Are you ready to play(Y/N)?");
			Scanner sc = new Scanner(System.in);
			
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("Y")) 
			{
				System.out.println("Please select your Quiz topic\nJava\nSpring Boot\nC");
				String topic=sc.nextLine();
				System.out.println("Please select the Quiz level\nBasic\nIntermediate\nAdvanced");
				String level=sc.nextLine();
				if((topic.equalsIgnoreCase("Java")||topic.equalsIgnoreCase("Spring Boot")||topic.equalsIgnoreCase("C"))&&
						((level.equalsIgnoreCase("Basic")||level.equalsIgnoreCase("Intermediate")||level.equalsIgnoreCase("Advanced"))))
				{	
					QuizService service = new QuizService();
					service.playQuiz(topic,level);		
				}
				else
				{
					System.out.println("Please choose from the listed one");
				}
				valid=true;
			}
			
			else if(input.equalsIgnoreCase("N"))
			{
				System.out.println("Thank you for visiting");
				valid=true;
			}
			else
			{
				System.out.println("Please enter a correct input");
			}
		}while(!valid);
			
			
	}
}
