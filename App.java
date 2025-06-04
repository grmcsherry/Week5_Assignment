package Week5_Assignment;

public class App {													// created a class named App 

	public static void main(String[] args) {						// has a main method
				
	Logger asteriskLogger = new AsteriskLogger();					// instantiates a new AsteriskLogger called asteriskLogger
	Logger spacedLogger = new SpacedLogger();						// instantiates a new SpacedLogger called spacedLogger

	System.out.println("Asterisk Logger - log():");					// prints Asterisk Logger
		asteriskLogger.log("Stressed");								// word from asteriskLogger.log

	System.out.println("\nAsterisk Logger - error():");				// prints next line Asterisk Error
		asteriskLogger.error("Stressed");							// word from asteriskLogger.error

	System.out.println("\nSpaced Logger - log():");					// prints next line Spaced Logger 
		spacedLogger.log("Stressed");								// word from spacedLogger.log

	System.out.println("\nSpaced Logger - error():");				// prints next line Spaced Logger 
		spacedLogger.error("Stressed");								// word from spacedLogger.error

	}	
	
}

// 6. Create a class named App that has a main method.

// a. In this class instantiate an instance of each of your logger classes that implement the Logger interface.

// b. Test both methods on both instances, passing in Strings of your choice.
