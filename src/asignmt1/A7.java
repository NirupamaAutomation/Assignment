package asignmt1;

// count the occurrence of char 'S'

public class A7 
{
	public static void main(String[] args)
	{
		String s1 = "SUCCESS";
		String s2 = "";
		char[] ch = s1.toCharArray();
		int count = 0;
		
		for(int i=0 ; i<ch.length ; i++)
		{		
				if(ch[i]=='S')
				{
					count ++;
				}
		}
		System.out.println("Occurrence of 'S' int the given String :: "+count);
	}
}