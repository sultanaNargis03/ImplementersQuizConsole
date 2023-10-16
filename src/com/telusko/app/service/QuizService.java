package com.telusko.app.service;
import java.util.Scanner;

import com.telusko.app.dao.Question;
import com.telusko.app.dao.Quiz;

public class QuizService 
{
	Question questions[] =new Question[15];
	static int score=0;
	
	public QuizService()
	{
		questions[0] = new Question(1, "Java", "size of int","Hard", "2", "6", "4", "8", "4");
		questions[1] = new Question(2, "Java", "size of double","Hard" ,"2", "6", "4", "8", "8");
		questions[2] = new Question(3, "Java", "size of char","easy", "2", "6", "4", "8", "2");
		questions[3] = new Question(4, "Java", "size of long", "medium","2", "6", "4", "8", "8");
		questions[4] = new Question(5, "Java", "size of float","medium", "1", "2", "4", "8", "4");
		
		questions[5] = new Question(1, "Spring Boot", "Which Spring annotation is used to handle HTTP PUT requests?","easy",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@PutMapping");
		questions[6] = new Question(2, "Spring Boot", "Which Spring annotation is used to handle HTTP POST requests?","easy",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@PostMapping");
		questions[7] = new Question(3, "Spring Boot", "Which Spring annotation is used to handle HTTP DELETE requests?","Hard",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@DeleteMapping");
		questions[8] = new Question(4, "Spring Boot", "Which Spring annotation is used to handle HTTP GET requests?","Hard",
				"@GetMapping", "@PutMapping", "@PostMapping", "@DeleteMapping", "@GetMapping");
		questions[9] = new Question(5, "Spring Boot",
				"Which annotation do we use to mark the class as a Service class/component?","Medium", "@Service", "@Controller",
				"@Repository", "@Component", "@Service");
		questions[10] = new Question(1, "C", "What will be the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "#include <stdio.h>\r\n"
				+ "int main() {\r\n"
				+ "	int a = 3, b = 5;\r\n"
				+ "	int t = a;\r\n"
				+ "	a = b;\r\n"
				+ "	b = t;\r\n"
				+ "	printf(\"%d %d\", a, b);\r\n"
				+ "	return 0;\r\n"
				+ "}", "3 5","Hard","3 3", "5 3", "5 5", "5 3");
		questions[11] = new Question(2, "C", "What is the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "int main() {\r\n"
				+ "	int sum = 2 + 4 / 2 + 6 * 2;\r\n"
				+ "	printf(\"%d\", sum);\r\n"
				+ "	return 0;\r\n"
				+ "}","Hard", "2", "15", "16", "18", "16");
		questions[12] = new Question(3, "C", "What is the output of the following code snippet?\r\n"
				+ "\r\n"
				+ "#include <stdio.h>\r\n"
				+ "int main() {\r\n"
				+ "	int a[] = {1, 2, 3, 4};\r\n"
				+ "	int sum = 0;\r\n"
				+ "	for(int i = 0; i < 4; i++) {\r\n"
				+ "	    sum += a[i];\r\n"
				+ "	}\r\n"
				+ "	printf(\"%d\", sum);\r\n"
				+ "	return 0;","Medium", "1", "4", "20", "10", "10");
		questions[13] = new Question(4, "C", " \r\n"
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
				+ "}", "Medium","12", "24", "20", "18", "20");
		questions[14] = new Question(5, "C", " \r\n"
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
				+ "}","Easy", "104", "24", "10", "34", "34");
		
	}
	public String userInput()
	{
		//taking answer from user
		System.out.println("Enter answer for Question " + "\t*** to skip the question please enter skip");
		Scanner sc = new Scanner(System.in);
		String userAnswer = sc.nextLine();
		
		return userAnswer;
	}
	public int calculateScore(String userAnswer,Question q)
	{
		//compare the right answer with user answer and calculate the score acc.
		if (userAnswer.equalsIgnoreCase("skip")) 
		{
			System.out.println("you have skipped the question"+q.getId()+"!");
			score += 0;
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
					String userAnswer =userInput();
					calculateScore(userAnswer,q);	
				}
			}
			else if(level.equalsIgnoreCase("Intermediate"))
			{
				if(topic.equalsIgnoreCase(q.getCategory())&&q.getDifficultyLevel().equalsIgnoreCase("Medium"))
				{
					System.out.println(q.getId() + ". " + q.getQuestionTitle());
					System.out.println(
							"A." + q.getOption1() + " B." + q.getOption2() + " C." + q.getOption3() + " D." + q.getOption4());
					String userAnswer =userInput();
					calculateScore(userAnswer,q);	
				}
			}
			else if(level.equalsIgnoreCase("Advanced"))
			{
				if(topic.equalsIgnoreCase(q.getCategory())&&q.getDifficultyLevel().equalsIgnoreCase("Hard"))
				{
					System.out.println(q.getId() + ". " + q.getQuestionTitle());
					System.out.println(
							"A." + q.getOption1() + " B." + q.getOption2() + " C." + q.getOption3() + " D." + q.getOption4());
					String userAnswer =userInput();
					calculateScore(userAnswer,q);	
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
