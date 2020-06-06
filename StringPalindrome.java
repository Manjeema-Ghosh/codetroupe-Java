import java.util.*;
public class StringPalindrome {
	public static void main(String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    String st=sc.nextLine();
	    String rev="";
	    int n=st.length()-1;
	   for ( int i = n; i >= 0; i-- )  
	   {
	         rev = rev + st.charAt(i);  
	   }
	    if(st.equals(rev))
	    {
	        System.out.println("Palindrome");
	    }
	    else
	    {
	       System.out.println("Not Palindrome"); 
	    }
	    sc.close();
	    
	 }
	

}
