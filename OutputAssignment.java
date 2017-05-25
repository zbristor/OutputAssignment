
	import java.util.Scanner;
	public class OutputAssignment { public static void main( String[] args ) { Scanner sc = new Scanner(System.in);
	
		Scanner keyboard = new Scanner(System.in);
	    String firstName;
	    int age;
	    String height;
	    double gpa;

	    System.out.print( "What is your first name? " );
	    firstName = keyboard.next();

	    System.out.print( "How old are you? " );
	    age = keyboard.nextInt();

	    System.out.print( "How tall are you? " );
	    height = keyboard.next();

	    System.out.print( "What is your GPA? " );
	    gpa = keyboard.nextDouble();
	    System.out.println("Your name is "+firstName+". You are "+age+" years old. "+"You are "+height+" feet tall "+"and your gpa is "+gpa);

	    }
	}

