import java.util.Scanner;
import java.io.*;
public class BeeMovie {
	public static void main (String [] args) {
		try {
			Scanner scan = new Scanner(new BufferedReader(new FileReader("script.txt")));
			String script = scan;
			String search = /[(?!)bee]/g;
			int [] match = search.exec(script);
			System.out.println(match.length);
	}
}