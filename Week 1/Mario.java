import java.util.Scanner;

public class Mario {
	public static void main(String []args) {
		int height;
		Scanner scan = new Scanner(System.in);
	    do
	    {
	        System.out.println("height: ");
	        height = scan.nextInt();
	    }
	    while(height < 0  || height > 23);
	    
	    for(int i = height; i >= 1; i--) {
	        for(int j = 0; j <= height; j++){
	            if(j >= (i - 1))
	            	System.out.print("#");
	            else
	            	System.out.print(" ");
	        }
	        System.out.print("\n");
	    }
	}
}
