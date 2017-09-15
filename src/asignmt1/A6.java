package asignmt1;
/*
 string = Testin

O/P

T

e s

t i n
 */
public class A6 
{  
	public static void main(String[] args) 
	{
		String s1 = "Testin";
		String s2 = "";
		int a=0;
		
		
		
		char[] ch = s1.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++)
		{
			for(int j=0 ; j<i ; j++)
			{
				System.out.print(ch[a]+" ");
				a++;
			}
			System.out.println();
			System.out.println();
		}
	}
}
