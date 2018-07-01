import java.util.Scanner;



public class Caesar{
    
	public static void main(String []args){
        
	String ra;
        
	String str;
       
	Scanner scan = new Scanner(System.in);
        
	ra = scan.nextLine();
        
	str = scan.nextLine();
        
	char[] k = ra.toCharArray();
        
	char[] plain = str.toCharArray();
        
	for (int i=0 ; i<ra.length();i++){
        
		if (!Character.isLetter(k[i])){
            
			System.out.print("Not All Alphabetic");
            
			return;
        
		}
    
	}
    
	int counter = 0;
    
	char c = 'a';
    
	int goo = 0;
         
	for (int r=0; r<str.length(); r++){
    
		if (!Character.isLetter(plain[r])){
        
			counter++;
        
			System.out.print(plain[r]); 
    
		}
    
		else{
        
			int z = plain[r]; 
        
			int t = ((r - counter)%ra.length());
        
			int y = k[t]; 
       
        
			if (Character.isUpperCase(plain[r])){
            
				if(Character.isUpperCase(k[t])){
                
					goo = ((((z-65)+(y-65))%26)+65); 
                
					c = (char)goo;
                
					System.out.print(c);
                
            
				}
            
				else{
                 
					goo = ((((z-65)+(y-97))%26)+65);
                 
					c = (char)goo;
                 
					System.out.print(c);
            
				}
            
            
        
			}
        
			if (Character.isLowerCase(plain[r])){
            
				if(Character.isUpperCase(k[t])){
                
					goo = ((((z-97)+(y-65))%26)+97);
                
					c =(char) goo;
                 
					System.out.print(c);
                
            
				}
            
				else{
                
					goo = ((((z-97)+(y-97))%26)+97);
                
					c =(char) goo;
                
					System.out.print(c);
            
				}
        
			}

		}

	}

	System.out.print("\n");
    
	}

}