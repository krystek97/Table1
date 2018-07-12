package table.sportcode.pl;

public class MultidimensionalTable 
{
	public static void main(String[] args)
	{
		int[][] table = new int[2][3] ;
		
		table[0][1] = 23 ;
		table[1][1] = 34 ; 
		System.out.println(table[0][1]);
		System.out.println(table[1][1]);
	}
}
