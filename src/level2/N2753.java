package level2;
import java.util.Scanner;

public class N2753 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		if(n % 4 == 0 && (n % 100 != 0 || n % 400 == 0))
			System.out.println(1);
		else
			System.out.println(0);
		
	}

}
