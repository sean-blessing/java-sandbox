import java.util.ArrayList;
import java.util.Scanner;

public class SumCheckerApp {
	private static ArrayList<Integer> nums = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the Sum Checker App!");
		System.out.println("You will enter numbers to be stored in an array.");
		System.out.println("You will continue to be prompted until you enter a non-numeric value.");
		System.out.println("Then you will be prompted to enter a 'sum' number.");
		System.out.println("The app will then check to see if any 2 numbers in your array can be totaled to give the sum.");
		
		boolean arrayDone = false;
		Scanner sc = new Scanner(System.in);
		while (arrayDone!=true) {
			arrayDone = getInt(sc, "Enter a #: ");
		}
		System.out.println("What sum should we check for (will check each 2 # combination of the array against this #)?  ");
		int s = sc.nextInt();
		
		boolean sumMatch = false;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < nums.size(); j++) {
				int sum = nums.get(j)+nums.get(i);
				if (sum == s) {
					sumMatch = true;
				}
			}
		}
		
		String match = "NOT matched.";
		if (sumMatch) {
			match = "matched!!!!";
		}
		System.out.println("You sum was "+match);

	}
	
	private static boolean getInt(Scanner sc, String prompt) {
		int r = 0;
		boolean nonNumeric = false;
		System.out.println(prompt);
		if (sc.hasNextInt()) {
			r = sc.nextInt();
			nums.add(r);
		}
		else {
			sc.next();
			nonNumeric = true;
		}
		
		
		return nonNumeric;
	}

}
