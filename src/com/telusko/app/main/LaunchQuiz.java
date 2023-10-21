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
		boolean valid2=false;
		boolean valid3=false;
		
		do {
			System.out.println("Are you ready to play(Y/N)?");
			Scanner sc = new Scanner(System.in);
			
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("Y")) 
			{
				do {
				System.out.println("Please select your Quiz topic\nJava\nSpring Boot\nC");
				String topic=sc.nextLine();
				
				if((topic.equalsIgnoreCase("Java")||topic.equalsIgnoreCase("Spring Boot")||topic.equalsIgnoreCase("C")))		
				{	
					do {
					System.out.println("Please select the Quiz level\nBasic\nIntermediate\nAdvanced");
					String level=sc.nextLine();
					if((level.equalsIgnoreCase("Basic")||level.equalsIgnoreCase("Intermediate")||level.equalsIgnoreCase("Advanced")))
					{
						QuizService service = new QuizService();
						service.playQuiz(topic,level);	
						System.out.println("Thank you for playing!!");
						valid3=true;
					}
					else
					{
						System.out.println("please choose from the listed!!");
					}
					}while(!valid3);
					valid2=true;
				}
				else
				{
					System.out.println("invalid input!!");
				}
				}while(!valid2);
				
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
