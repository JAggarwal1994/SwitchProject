package switchproject;
import java.util.Scanner;

public class SwitchProject {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int problemsAttempted = 0;
        int correctProblems = 0;
        boolean continueQuiz = true;

        System.out.println("Welcome to the Wright State School of Math!");
        System.out.println("");
        System.out.println("Please choose one of the following options "
                + "for your math quiz:");
        System.out.println("1. Addition with numbers 1 - 10");
        System.out.println("2. Addition with numbers 1 - 100");
        System.out.println("3. Subtraction with numbers 1 - 10");
        System.out.println("4. Subtration with numbers 1 - 100");
        System.out.println("5. Multiplication with numbers 1 - 10");
        System.out.println("6. Exit the program");
        System.out.println("");
        
        while (continueQuiz) 
        {
            int quizOption = userInput.nextInt();

            switch (quizOption) 
            {
                case 1:
                    for (int problems = 0; problems < 5; problems++) 
                    {
                        int integerOne = (int) (1 + Math.random() * 10);

                        int integerTwo = (int) (1 + Math.random() * 10);
                        System.out.println("Enter the answer to the "
                                + "following problem: " + integerOne
                                + " + " + integerTwo);
                        int correctAnswer = integerOne + integerTwo;
                        int userAnswer = userInput.nextInt();
                        problemsAttempted++;

                        if (userAnswer != correctAnswer) 
                        {
                            System.out.println("Sorry, that is "
                                    + "incorrect. The correct answer is "
                                    + correctAnswer);
                            System.out.println("");
                        } 
                        else 
                        {
                            System.out.println("That is correct!");
                            System.out.println("");
                            correctProblems++;
                        }
                    }
                    System.out.println("Welcome to the Wright State School of Math!");
                    System.out.println("");
                    System.out.println("Please choose one of the following options "
                            + "for your math quiz:");
                    System.out.println("1. Addition with numbers 1 - 10");
                    System.out.println("2. Addition with numbers 1 - 100");
                    System.out.println("3. Subtraction with numbers 1 - 10");
                    System.out.println("4. Subtration with numbers 1 - 100");
                    System.out.println("5. Multiplication with numbers 1 - 10");
                    System.out.println("6. Exit the program");
                    System.out.println("");
                    break;

                case 2:
                    for (int problems = 0; problems < 5; problems++) 
                    {
                        int integerOne = (int) (1 + Math.random() * 100);
                        int integerTwo = (int) (1 + Math.random() * 100);
                        System.out.println("Enter the answer to the "
                                + "following problem: " + integerOne
                                + " + " + integerTwo);
                        int correctAnswer = integerOne + integerTwo;
                        int userAnswer = userInput.nextInt();
                        problemsAttempted++;

                        if (userAnswer != correctAnswer) 
                        {
                            System.out.println("Sorry, that is "
                                    + "incorrect. The correct answer is "
                                    + correctAnswer);
                            System.out.println("");
                        } 
                        else 
                        {
                            System.out.println("That is correct!");
                            System.out.println("");
                            correctProblems++;
                        }
                    }
                    System.out.println("Welcome to the Wright State School of Math!");
                    System.out.println("");
                    System.out.println("Please choose one of the following options "
                            + "for your math quiz:");
                    System.out.println("1. Addition with numbers 1 - 10");
                    System.out.println("2. Addition with numbers 1 - 100");
                    System.out.println("3. Subtraction with numbers 1 - 10");
                    System.out.println("4. Subtration with numbers 1 - 100");
                    System.out.println("5. Multiplication with numbers 1 - 10");
                    System.out.println("6. Exit the program");
                    System.out.println("");
                    break;

                case 3:
                    for (int problems = 0; problems < 5; problems++) 
                    {
                        int integerOne = (int) (1 + Math.random() * 10);
                        int integerTwo = (int) (1 + Math.random() * 10);
                        System.out.println("Enter the answer to the "
                                + "following problem: " + integerOne
                                + " - " + integerTwo);
                        int correctAnswer = integerOne - integerTwo;
                        int userAnswer = userInput.nextInt();
                        problemsAttempted++;

                        if (userAnswer != correctAnswer) 
                        {
                            System.out.println("Sorry, that is incorrect. "
                                    + "The correct answer is " + correctAnswer);
                            System.out.println("");
                        } 
                        else 
                        {
                            System.out.println("That is correct!");
                            System.out.println("");
                            correctProblems++;
                        }
                    }
                    System.out.println("Welcome to the Wright State School of Math!");
                    System.out.println("");
                    System.out.println("Please choose one of the following options "
                            + "for your math quiz:");
                    System.out.println("1. Addition with numbers 1 - 10");
                    System.out.println("2. Addition with numbers 1 - 100");
                    System.out.println("3. Subtraction with numbers 1 - 10");
                    System.out.println("4. Subtration with numbers 1 - 100");
                    System.out.println("5. Multiplication with numbers 1 - 10");
                    System.out.println("6. Exit the program");
                    System.out.println("");
                    break;

                case 4:
                    for (int problems = 0; problems < 5; problems++) 
                    {
                        int integerOne = (int) (1 + Math.random() * 100);
                        int integerTwo = (int) (1 + Math.random() * 100);
                        System.out.println("Enter the answer to the "
                                + "following problem: " + integerOne
                                + " - " + integerTwo);
                        int correctAnswer = integerOne - integerTwo;
                        int userAnswer = userInput.nextInt();
                        problemsAttempted++;

                        if (userAnswer != correctAnswer) 
                        {
                            System.out.println("Sorry, that is "
                                    + "incorrect. The correct answer is "
                                    + correctAnswer);
                            System.out.println("");
                        } 
                        else 
                        {
                            System.out.println("That is correct!");
                            System.out.println("");
                            correctProblems++;
                        }
                    }
                    System.out.println("Welcome to the Wright State School of Math!");
                    System.out.println("");
                    System.out.println("Please choose one of the following options "
                            + "for your math quiz:");
                    System.out.println("1. Addition with numbers 1 - 10");
                    System.out.println("2. Addition with numbers 1 - 100");
                    System.out.println("3. Subtraction with numbers 1 - 10");
                    System.out.println("4. Subtration with numbers 1 - 100");
                    System.out.println("5. Multiplication with numbers 1 - 10");
                    System.out.println("6. Exit the program");
                    System.out.println("");
                    break;

                case 5:
                    for (int problems = 0; problems < 5; problems++) 
                    {
                        int integerOne = (int) (1 + Math.random() * 10);
                        int integerTwo = (int) (1 + Math.random() * 10);
                        System.out.println("Enter the answer to the "
                                + "following problem: " + integerOne
                                + " * " + integerTwo);
                        int correctAnswer = integerOne * integerTwo;
                        int userAnswer = userInput.nextInt();
                        problemsAttempted++;

                        if (userAnswer != correctAnswer) 
                        {
                            System.out.println("Sorry, that is "
                                    + "incorrect. The correct answer is "
                                    + correctAnswer);
                            System.out.println("");
                        } 
                        else 
                        {
                            System.out.println("That is correct!");
                            System.out.println("");
                            correctProblems++;
                        }
                    }
                    System.out.println("Welcome to the Wright State School of Math!");
                    System.out.println("");
                    System.out.println("Please choose one of the following options "
                            + "for your math quiz:");
                    System.out.println("1. Addition with numbers 1 - 10");
                    System.out.println("2. Addition with numbers 1 - 100");
                    System.out.println("3. Subtraction with numbers 1 - 10");
                    System.out.println("4. Subtration with numbers 1 - 100");
                    System.out.println("5. Multiplication with numbers 1 - 10");
                    System.out.println("6. Exit the program");
                    System.out.println("");
                    break;

                case 6:
                    double percentageCorrect
                            = ((double) correctProblems / problemsAttempted)
                            * 100;
                    System.out.printf("You got %d problems correct out of %d "
                            + "problems attempted. That is %.2f percent "
                            + "correct. Goodbye!"
                            , correctProblems, problemsAttempted
                            , percentageCorrect);
                    continueQuiz = false;
                    break;

                default:
                    System.out.println("Valid choices are 1-6; please "
                            + "re-enter");
                    break;
            }
        }
    }
}
