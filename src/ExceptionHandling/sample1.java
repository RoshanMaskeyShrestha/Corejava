package ExceptionHandling;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the string");
     String st=s.nextLine();
     String rs=" ";
    try {
     if(st==" ")
     {
    	 throw new EmptyStringException("string is empty");
     }
     char ch[]=st.toCharArray();
     for (int i = 0; i < st.length(); i++) {
    	
    	 if(ch[i]>='0'&&ch[i]<='9')
    	 {
    		 throw new DigitcontainException("its contain didgit");
    	 }
    	 
     
	}
     }
     
     catch(EmptyStringException e) {
    	System.out.println(	e.getMessage());
    	
     }
     catch( DigitcontainException e1) {
    	 System.out.println(e1.getMessage());
     }
     
     
     char ch[]=st.toCharArray();
     
     for(int i=ch.length-1;i>=0;i--)
     {
    	 int f=i;
    	 
    	 
    	 while(i>=0&& ch[i]!=' ')
    	 {
    		 i--;
    	 }
    	 int j=i+1;
    	 while(j<=f)
    	 {
    		 rs=rs+ch[j];
    		 j++;
    	 }
    	 if(i>=0) {
    		 rs=rs+ch[i];
    				 
    	 }
    	 
    	 
    	 
     }
     System.out.println(rs);
     
  
     
     
	}

}
