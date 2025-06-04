package Week5_Assignment;

public class AsteriskLogger implements Logger {									// created a class called AsteriskLogger that implements Logger

// log method
	
    @Override																	// implementing method in Interface Logger (reduces errors in Compiler)
    public void log(String message) {											// void method log with String as an argument (message)
        System.out.println("***" + message + "***");							// prints out String message as per 4a (between "***")
    }

// error method

    @Override																	// implementing method in Interface Logger (reduces errors in Compiler)
    public void error(String message) {											// void method error with String as an argument (message)									
        String errorMessage = "***Error: " + message + "***";					// creates String "errorMessage"
        String border = "*".repeat(errorMessage.length());						// creates String "border" and sets the length of the border to length of errorMessage
        System.out.println(border);												// Prints first line of error message as per 4b
        System.out.println(errorMessage);										// Prints second line of error message as per 4b
        System.out.println(border);												// Prints last line of error message as per 4b
    }
}

//4. Implement the AsteriskLogger methods: Note: The AsteriskLogger will use the asterisk or “*”.

// a. The log method on the AsteriskLogger should print out the String it receives between 
// 3 asterisks on either side of the String (e.g. if the String passed in is
// “Hello”, then it should print ***Hello*** to the console).

// b. The error method on the AsteriskLogger should print the String it receives inside
// a box of asterisks, with the String preceded by the word “ERROR:”. For example,
// if “Hello” is the argument, the following should be printed:
// ******************
// ***Error: Hello***
// ******************
