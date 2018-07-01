import java.util.Scanner;



public class Caesar{
    
	public static void main(String []args){
        
		int k;
        
		String str;
        
		Scanner scan = new Scanner(System.in);
        
		k = scan.nextInt();
        
		str = scan.next();
        
		char[] s = str.toCharArray();
        
		char[] ca = new char[str.length()];
         
		for (int j=0; j<str.length(); j++){
            
			if (Character.isLowerCase(s[j]))
{
                
				int letter = s[j];  
                
				letter = letter - 97;              
                
				letter = (letter+k)%26;          
                
				letter = letter +97;               
                
				s[j] = (char)letter;
                
				ca[j] = s[j];
            
			}
            
			if (Character.isUpperCase(s[j]))
{
                
				int letter = s[j];  
                
				letter = letter - 65;      
                
				letter = (letter+k)%26;          
                
				letter = letter +65;             
                
				s[j] = (char)letter;
                
				ca[j] = s[j];
            
			}
        
		}
        
	System.out.print(ca);
    
	}

}