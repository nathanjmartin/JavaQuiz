package CSQuiz1;

import java.util.Scanner;
public class CSQuiz {
    //main method
    public static void main(String[] args) {
        //creating a scanner
        Scanner input = new Scanner(System.in);
        //the two 2D arrays to hold the questions and answers
        String[][] question;
        String[][] answer;
        question = createQuestions();
        answer = createAnswers();
        //while loop that calls the giveQuiz method and allows the user to take multiple quizzes
        while(true) {
            giveQuiz(createQuestions(), createAnswers());
            System.out.println("Would you like to take another quiz? (y/n)");
            String yesorno = input.nextLine();
            if(yesorno.equalsIgnoreCase("y")== false)
                break;
        }
        System.out.println("Have a nice day!");
    }
    public static String[][] createQuestions() {
        //chapter 5 questions
        String[][] question = {{"There are three types of repetition statements: the while loop, the do-while loop, and the ___ loop", 
                    "The part of the loop that contains the statements to be repeated is called the loop ____",
                    "A one-time execution of a loop body is referred to as an ________ of the loop", 
                    "An ________ loop is a loop statement that executes infinitely", 
                    "In designing loops, you need to consider both the loop ______ structure and the loop body",  
                    "The _____ loop checks the loop-continuation-condition first. If the condition is true, the loop body is executed; if it is false, the loop terminates",
                    "The ______ loop is similar to the while loop, except that the do-while executes the loop body first and then checks the loop-continuation-condition to decide whether to continue or to terminate", 
                    "The while loop and the do-while loop often are used when the number of repetitions is ___ predetermined", 
                    "A sentinel value is a special value that signifies the ___ of the loop", 
                    "The for loop generally is used to execute a loop body a _____ number of times", 
                    "The third part is executed after each iteration and is often used to adjust the _____ variable. Usually, the loop control variables are initialized and changed in the control structure",
                    "The while loop and for loop are called ______ loops because the continuation condition is checked before the loop body is executed", 
                    "The do-while loop is called a ________ loop because the condition is checked after the loop is executed",
                    "Two keywords, _____ and continue, can be used in a loop", 
                    "The break keyword immediately ____ the innermost loop, which contains the break", 
                    "The _______ keyword only ends the current iteration"},
                //chapter 6 questions
                {"Making programs _____ and reusable is one of the central goals in software engineering. Java provides many powerful constructs that help to achieve this goal. Methods are one such construct.",
                    "The method _____ specifies the modifiers, return value type, method name, and parameters of the method. The static modifier is used for all the methods in this chapter",
                    "A method may return a _____. The returnValueType is the data type of the value the method returns. If the method does not return a value, the returnValueType is the keyword void.",
                    "The parameter list refers to type, order, and number of a method's parameters. Parameters are ______; that is, a method doesn't need to contain any parameters",
                    "A ______ statement can also be used in a void method for terminating the method and returning to the method's caller. This is useful occasionally for circumventing the noraml flow of control in a method", 
                    "The arguments that are passed to a method should have the same number, ____ and order as the parameters in the method signature",
                    "When a program calls a ______, program control is transferred to the called method. A called method returns control to the caller when its return statement is executed or when its method-ending closing brace is reached",
                    "A value returning method can also be invoked as a _________ in Java. In this case, the caller simply ignores the return value.",
                    "A method can be _________. This means that two methods can have the same name, as long as their method parameter lists differ",
                    "A variable declared in a method is called a _____ variable. The scope of a local variable starts from its declaration and continues to the end of the block that contains the variable. A local variable must be declared and initialized before it is used.",
                    "Method abstraction is achieved by separating the use of a method from its ___________",
                    "Method abstraction _________ programs in a neat, hierarchial manner. Programs written as collections of concise methods are easier to write, debug, maintain, and modify than would otherwise be the caase. This writing style also promotes method reusability.",
                    "When implementing a large ______, use the top=down and/or bottom-up coding approach. Do not write the entire program at once. This approach may seem to take more time for coding, but it actually saves time and makes debugging easier"},
                //chapter 7 questions
                {"A variable is _______ as an array type using the syntax elementType[] arrayRefVar or elementType arrayRefvar[]. The style elementType[] arrayRefVar is preferred, although elementType arrayRefVar[] is legal",
                    "Unlike declarations for ______ data type variables, the declaration of an array variable does not allocate any space in memory for the array. An array variable is not a primitive data type variable. An array variable contains a reference to an array",
                    "You cannot assign _______ to an array unless it has already been created. You can create an array by using the new operator wit the following syntax: new elementType[arraySize]",
                    "Each element in the array is represented using the ______ arrayRefVar[index]. An index must be an integer or an integer expression.",
                    "After an array is created, its size becomes ______ and can be obtained using arrayRefVar.length. Since the index of an array always begins with 0, the last index is always arrayRefVar.length - 1.",
                    "Programmers often mistakenly reference the first element in an array with index _, but it should be 0. This is called the index off-by-oone error.",
                    "When an array is created, its elements are assigned the default value of _ for the numberic primitive data types, (\u0000) for char types, and false for boolean types",
                    "Java has a _________ notation, known as the array initializer, which combines declaring an array, creating an array, and initializing an array in one statment, using the syntax elementType[] arrayRefVar = {value0, value 1,..., valuek}",
                    "When you pass an array ________ to a method, you are actually passing the reference of the array; that is, the called method can modify the elements in the caller's original array.",
                    "If an array is ______, binary search is more efficient than linear search for finding an element in the array.",
                    "________ sort finds the smallest number in the list and swaps it with the first element. It then finds the smallest number remaining and swaps it with the first element in the remaining list, and so on, until only  a single number remains."},
                //chapter 8 questions
                {"A ____________ array can be used to store a table.",
                    "A _________ for two-dimensional arrays can be declared using the syntax: elementType[][] arrayVar.",
                    "A two-dimensional array can be ________ using the syntax: new elementType[ROW_SIZE][COLUMN_SIZE].",
                    "Each element in a two-dimensional _____ is represented using the syntax: arrayVar[rowIndex][columnIndex].",
                    "You can create and ________ a two-dimensional array using an array initializer with the syntax: elementType[][] arrayVar = {{row values},...,{row values}}.",
                    "You can use arrays of ______ to form multidimensional arrays. For esxample, a variable for three-dimensional arrays can be declared as elementType[[][] arrayVar and a three-dimensional array can be created using new elementType[size1][size2][size3]"},
                //chapter 9 questions
                {"A ______ is a template for objects. It defines the properties of objects and provides constructors for creating objects and methods for manipulating them.",
                    "A class is also a ____ type. You can use it to declare object reference variables.",
                    "An object is an ________ of a class. You can use the new operator to create an object, and the dot operator(.) to access members of that object through its reference variable.",
                    "An instance variable or _______ belongs to an instance of a class. Its use is associated with individual instances. A static variable is a variable shared by all instances of the same class. A static method is a method that can be invoked without using intances.",
                    "Every instance of a class can ______ the class's static variables and methods. For clarity, however, it is better to invoke static variables and methods using ClassName.variable and ClassName.method.",
                    "___________ modifiers specify how the class, method and data are accessed. A public class, method, or data is accessible to all clients. A private method or data is accessible only inside the class.",
                    "You can provide a getter (______) method or a settler (mutator) method to enable clients to see or modify the data.",
                    "A getter method has the signature public __________ getPropertyName(). If the returnType is boolean, the get method should be defined as public boolean isPropertyName().",
                    "All __________ are passed to methods using pass-by-value. For a parameter of a primitive type, the actual value is passed; for a parameter of a reference type, the reference for the object is passed.",
                    "A java array is an ______ that can contain primitive type values or object type values. When an array of objects is created, its elements are assigned the default value of null.",
                    "Once it is created, an ________ object cannot be modified. To prevent users from modifying an object, you can define immutable classes.",
                    "The _____ of instance and static variables is the entire class, regardless of where the variables are declared. Instance and static variables can be declared anywhere in the class. For consistency, they are declared at the beginning of the class in this book.",
                    "The keyword ____ can be used to refer to the calling object. It can also be used inside a constructor to invoke another constructor of the same class."
                }};
        return question;
    }
    public static String[][] createAnswers() {
        String[][] answer = 
            //chapter 5 answers
            {{"for", "body", "iteration", "infinite", "control", "while", "do-while", "not", "end", "fixed", "control", "pretest", "posttest", "break", "ends", "continue"},
                //chapter 6 answers 
                {"modular", "header", "value", "optional", "return", "type", "method", "statement", "overloaded", "local", "implementation", "modularizes", "programs"},
                //chapter 7 answers
                {"declared", "primitive", "elements", "syntax", "permanent", "1", "0", "shorthand", "argument", "sorted", "Selection"},
                //chapter 8 answers
                {"two-dimensional", "variable", "created", "array", "initialize", "arrays"},
                //chapter 9 answers
                {"class", "data", "instance", "method", "access", "Visibility", "accessor", "returnType", "parameters", "object", "immutable", "scope", "this"}};
        return answer;
    }
    public static void giveQuiz(String[][] question, String[][] answer) {
        //greeting the user
        System.out.println("Welcome to the CS1 Review Quiz!");
        //informing the user of what the quiz will cover
        System.out.println("\nThis quiz will present chapter summary items from chapters 5-9 of the Liang Java textbook. \nEach summary item will have one blank which needs to be filled in with a term which may be one or more words.\n");
        //variables that are going to be used throughout the method to keep the score and the variabled used to calculate the total score.
        int questionNumber = 1;
        int score = 0;
        int totalScore = score / questionNumber;
        //the for loop that goes through every chapter
        for(int i = 0; i < question.length; i++) {
            //assigning j (which are the questions) to choose a random question from each chapter.
            int j = (int)(Math.random() * question[i].length - 1);
            //if statement that determines if the user's response is true and what it prints out if it is false
            if(giveQuestion(questionNumber, i, j, question, answer) == true) {
                score++;
                System.out.println("Correct!" + "\nPlease see chapter" + " " + (i+5) + " " + "," + "item" + " " + (j+1) + "\nCurrent Score: " + score + "/" + questionNumber + " " + "=" + " " + ((double)score/(double)questionNumber) * 100 + "%");
            }
            else
                System.out.println("Not quite!\n" + "The correct answer was: " + answer[i][j] + "\nPlease see chapter" + " " + (i+5) + " " + "," + "item" + " " + (j+1) + "\nCurrent Score: " + score + "/" + questionNumber + " " +  "=" + " " + ((double)score/(double)questionNumber) * 100 + "%");
                //the i+5 and the j+1 are used since we are starting with chapter 5 and going to 9, and j + 1 is done since arrays start with 0, however in the book if someone were to count it, they would normally start with 1, not 0.
            
            //incrementing the question number
            questionNumber++;
        }
    }
    public static boolean giveQuestion(int questionNumber, int chapter, int item, String[][] question, String[][] answer) {
        //creating a scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println(questionNumber + "." + " " + question[chapter][item]);
        System.out.print("Your answer?" + " ");
        String response = input.nextLine();
        return (response.equalsIgnoreCase(answer[chapter][item]) == true );
    }
}