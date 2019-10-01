import java.util.Scanner;

public class Mario {
	public static void main(String []args) {
		int height;
		Scanner sc = new Scanner(System.in);
	    do
	    {
	        System.out.println("height: ");
	        height = sc.nextInt();
	    }
	    
	    
	    for(int i = height; i >= 1; i--) {
	        for(int j = 0; j <= height; j++){
	            if(j >= (i - 1))
	            	System.out.print("#");
	            else
	            	System.out.print(" ");
	        }
		sc.close();
	        System.out.print("\n");
		
	    }
	}
}
