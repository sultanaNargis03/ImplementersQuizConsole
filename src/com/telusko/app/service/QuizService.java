package com.telusko.app.service;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.telusko.app.dao.Question;


public class QuizService 
{
	Question questions[] =new Question[18];
	static int score=0;
	
	public QuizService()
	{
		questions[0] = new Question(1, "Java", "size of int","Easy", "2", "6", "4", "8", "4");
		questions[1] = new Question(2, "Java", "size of double","Easy" ,"2", "6", "4", "8", "8");
		questions[2] = new Question(3, "Java", "default capacity of StringBuffer/StringBuilder class","Hard", "0", "16", "34", "18", "16");
		questions[3] = new Question(4, "Java", "In java Array is treated as an- ", "Hard","class", "object", "method", "variable", "object");
		questions[4] = new Question(5, "Java", "this keyword refered as","medium", "current object", "parent class", "main method", "final variable", "current object");
		questions[5] = new Question(6, "Java", "in java object created on","medium", "heap", "stack", "method area", "constructor", "heap");
		
		questions[6] = new Question(1, "Spring Boot", "Which Spring annotation is used to handle HTTP PUT requests?","Medium",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@PutMapping");
		questions[7] = new Question(2, "Spring Boot", "Which Spring annotation is used to handle HTTP POST requests?","Easy",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@PostMapping");
		questions[8] = new Question(3, "Spring Boot", "Which Spring annotation is used to handle HTTP DELETE requests?","Easy",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@DeleteMapping");
		questions[9] = new Question(4, "Spring Boot", "Which Spring annotation is used to handle HTTP GET requests?","Medium",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@GetMapping");
		questions[10] = new Question(5, "Spring Boot",
				"Which annotation do we use to mark the class as a Service class/component?","Hard", "@Service", "@Controller",
				"@Repository", "@Component", "@Service");
		questions[11] = new Question(5, "Spring Boot",
				"Which starter dependency is used to develop web applications or Restful web services\nspring-boot-starter-data-??","Hard", "@jpa", "@web",
				"@rest", "@None", "@web");
		
		
		questions[12] = new Question(1, "C", "What will be the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "#include <stdio.h>\r\n"
				+ "int main() {\r\n"
				+ "	int a = 3, b = 5;\r\n"
				+ "	int t = a;\r\n"
				+ "	a = b;\r\n"
				+ "	b = t;\r\n"
				+ "	printf(\"%d %d\", a, b);\r\n"
				+ "	return 0;\r\n"
				+ "}", "3 5","Medium","3 3", "5 3", "5 5", "5 3");
		questions[13] = new Question(2, "C", "What is the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "int main() {\r\n"
				+ "	int sum = 2 + 4 / 2 + 6 * 2;\r\n"
				+ "	printf(\"%d\", sum);\r\n"
				+ "	return 0;\r\n"
				+ "}","Hard", "2", "15", "16", "18", "16");
		questions[14] = new Question(3, "C", "What is the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "#include <stdio.h>\r\n"
				+ "int main() {\r\n"
				+ "	int a[] = {1, 2, 3, 4};\r\n"
				+ "	int sum = 0;\r\n"
				+ "	for(int i = 0; i < 4; i++) {\r\n"
				+ "	    sum += a[i];\r\n"
				+ "	}\r\n"
				+ "	printf(\"%d\", sum);\r\n"
				+ "	return 0;","Easy", "1", "4", "20", "10", "10");
		questions[15] = new Question(4, "C", " \r\n"
				+ "What will be the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "#include <stdio.h>\r\n"
				+ "void solve() {\r\n"
				+ "    int a = 3;\r\n"
				+ "    int res = a++ + ++a + a++ + ++a;\r\n"
				+ "    printf(\"%d\", res);\r\n"
				+ "}\r\n"
				+ "int main() {\r\n"
				+ "	solve();\r\n"
				+ "	return 0;\r\n"
				+ "}", "Hard","12", "24", "20", "18", "20");
		questions[16] = new Question(5, "C", " \r\n"
				+ "What will be the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "#include <stdio.h>\r\n"
				+ "#define VAL 3 * (2 + 6)\r\n"
				+ "void solve() {\r\n"
				+ "    int a = 10 + VAL;\r\n"
				+ "    printf(\"%d\", a);\r\n"
				+ "}\r\n"
				+ "int main() {\r\n"
				+ "	solve();\r\n"
				+ "	return 0;\r\n"
				+ "}","Medium", "104", "24", "10", "34", "34");
		
		questions[17] = new Question(5,"C"," What is an example of iteration in C?","Easy", "for", "while", "do-whiile", "All", "All");
	}
	public String userInput(Question q) throws NullPointerException
	{
		String answer=null;
		//taking answer from user
		try 
		{
			System.out.println("Pleae enter your answer \t*** to skip the question please enter skip");
			Scanner sc = new Scanner(System.in);
			String userAnswer = sc.next();
			//userAnswer=userAnswer.trim();
			if(
					userAnswer.equalsIgnoreCase(q.getOption1())||userAnswer.equalsIgnoreCase(q.getOption2())
					||userAnswer.equalsIgnoreCase(q.getOption3())||userAnswer.equalsIgnoreCase(q.getOption4())||userAnswer.equalsIgnoreCase("skip")
				)
			{
				answer=userAnswer;
			}
			
			else {
				throw new InputMismatchException();
			}
		}
		catch(InputMismatchException  ime)
		{
			System.out.println("Please choose the answer from the given options ");
			try 
			{
				System.out.println("Please enter your answer again\t*** to skip the question please enter skip");
				Scanner sc = new Scanner(System.in);
				String userAnswer = sc.nextLine();
				//userAnswer=userAnswer.trim();
				if(
						userAnswer.equalsIgnoreCase(q.getOption1())||userAnswer.equalsIgnoreCase(q.getOption2())
						||userAnswer.equalsIgnoreCase(q.getOption3())||userAnswer.equalsIgnoreCase(q.getOption4())||userAnswer.equalsIgnoreCase("skip")
					)
				{
					answer=userAnswer;
				}
				
				else {
					throw new InputMismatchException();
				}
			}
			catch(InputMismatchException ime2)
			{
				System.out.println("sorry!! we can't accept your answer");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return answer;
	}
	public int calculateScore(String userAnswer,Question q)
	{
		//userAnswer=userAnswer.trim();
		//compare the right answer with user answer and calculate the score acc.
		if (userAnswer.equalsIgnoreCase("skip")) 
		{
			System.out.println("you have skipped the question"+q.getId()+"!");
		} 
		else 
		{
			if (q.getRightAnswer().equalsIgnoreCase(userAnswer)) 
			{
				System.out.println("Right Answer!!");
				score += 2;
			} 
			else 
			{
				System.out.println("Oops!!Your answer is wrong");
				score -= 1;
			}
		}
		return score;
	}
	public void playQuiz(String topic,String level) 
	{
		
		
		for(Question q:questions)
		{
			if(level.equalsIgnoreCase("Basic"))
			{
				if(topic.equalsIgnoreCase(q.getCategory())&&q.getDifficultyLevel().equalsIgnoreCase("Easy"))
				{
					System.out.println(q.getId() + ". " + q.getQuestionTitle());
					System.out.println(
							"A." + q.getOption1() + " B." + q.getOption2() + " C." + q.getOption3() + " D." + q.getOption4());

					try {
					String userAnswer =userInput(q);
					calculateScore(userAnswer,q);
					}
					catch(NullPointerException e)
					{
						System.out.println("no marks will be added for this question!!");
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					
				}
			}
			else if(level.equalsIgnoreCase("Intermediate"))
			{
				if(topic.equalsIgnoreCase(q.getCategory())&&q.getDifficultyLevel().equalsIgnoreCase("Medium"))
				{
					System.out.println(q.getId() + ". " + q.getQuestionTitle());
					System.out.println(
							"A." + q.getOption1() + " B." + q.getOption2() + " C." + q.getOption3() + " D." + q.getOption4());
					try {
						String userAnswer =userInput(q);
						calculateScore(userAnswer,q);
						}
						catch(NullPointerException e)
						{
							System.out.println("sorry!! we can't accept your answer");
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
						}
				}
			}
			else if(level.equalsIgnoreCase("Advanced"))
			{
				if(topic.equalsIgnoreCase(q.getCategory())&&q.getDifficultyLevel().equalsIgnoreCase("Hard"))
				{
					System.out.println(q.getId() + ". " + q.getQuestionTitle());
					System.out.println(
							"A." + q.getOption1() + " B." + q.getOption2() + " C." + q.getOption3() + " D." + q.getOption4());
					try {
						String userAnswer =userInput(q);
						calculateScore(userAnswer,q);
						}
						catch(NullPointerException e)
						{
							System.out.println("sorry!! we can't accept your answer");
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
						}
				}
			}
			else
			{
				System.out.println("You have entered a wrong input");
			}
		}	
			System.out.println("score = " + score);
		

	}

}
