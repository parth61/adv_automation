package oop;

public class Reversestring 
{
		public String revString(String str)
		{
			String revstr="";
			for (int i=str.length()-1; i>=0; i--)
			{
				revstr=revstr+str.charAt(i);
				
			}
			return revstr;
			
		}
		
}
