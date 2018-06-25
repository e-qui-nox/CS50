import java.util.Scanner;

public class Cash {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Change owed: ");
	    double change = scan.nextDouble();
	    
	    while(change < 0) {
	        System.out.println("Change owed: ");
	        change = scan.nextDouble();
	    }

	    int cents = (int)Math.round(change * 100);
	    
	    int coins = 0;
	    if(cents >= 25)
	    {
	        coins += cents / 25;
	        cents %= 25;
	    }
	    if(cents >= 10)
	    {
	        coins += cents / 10;
	        cents %= 10;
	    }
	    if(cents >= 5)
	    {
	        coins += cents / 5;
	        cents %= 5;
	    }
	    if(cents >= 1)
	    {
	        coins += cents;
	    }

	    System.out.println(coins);
	}
}
