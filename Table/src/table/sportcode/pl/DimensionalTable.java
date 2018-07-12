package table.sportcode.pl;

public class DimensionalTable 
{
	public static void main(String[] args)
	{
		int table2[] = {3,4,5} ;//Deklaracja tablicy juz z okreslonymi elementami
		int table[] = new int[3] ;//Deklaracja 3 elementowej tablicy typu int
		
		for(int b = 0 ; b<3 ; b++)
		{
			for(int a = 123 ; a<126 ; a++)
			{
				table[b] = a;
				System.out.println(table[b]) ;
			}
		}
	}
}
