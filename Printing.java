package Package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Printing {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("This goes to the console");
		PrintStream console = System.out;

		File file = new File("out.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println("This goes to out.txt");

		System.setOut(console);
		System.out.println("This also goes to the console");
	}
}
