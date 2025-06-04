package Week5_Assignment;

public class SpacedLogger implements Logger {									// created a class called SpacedLogger that implements Logger

// log method
	
    @Override																	// implementing method in Interface Logger (reduces errors in Compiler)
    public void log(String message) {											// void method log with String as an argument (message)
        System.out.println(addSpaces(message));									// prints out String message as per 5a (spaces between " " each character)
    }

// error method
    
    @Override																	// implementing method in Interface Logger (reduces errors in Compiler)
    public void error(String message) {											// void method error with String as an argument (message)
        System.out.println("ERROR: " + addSpaces(message));						// prints out String message as per 5b (ERROR: and spaces between " " each character)
    }

    private String addSpaces(String message) {									// creates method of String called addSpaces with (String message)
        StringBuilder spaced = new StringBuilder();								// creates new StringBuilder called spaced
        for (int i = 0; i < message.length(); i++) {							// for loop to determine length of message
            spaced.append(message.charAt(i)).append(" ");						// append " " to each character of String
        }
        return spaced.toString().trim(); 										// trim to remove trailing space (no space after last character of String)
    }
}

// 5. Implement the SpacedLogger methods: Note: The SpacedLogger should add spaces
// between each character of the String argument passed into its methods.

// a. If the log method received “Hello” as an argument, it should print H e l l o

// b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
