import java.util.*;
class Pattern
{
	public void Patern(int iRow, int iCol)
    {
    	int i =0, j=0;
       
        
        for(i=1; i<=iRow; i++)
        {
            for(j=1; j<=iCol; j++ )
            {
                if(i+j==iRow+1)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
                
            }

            System.out.println("");
        }
    }
}
class Ans1
{
	public static void main(String arg[])
	{
        int iValue1 =0, iValue2=0;

		Scanner sobj = new Scanner(System.in);

		System.out.println("enter the number of rows");
        iValue1= sobj.nextInt();

        System.out.println("enter the number of columns");
		iValue2= sobj.nextInt();
		
        Pattern pobj = new Pattern();
        pobj.Patern(iValue1, iValue2);
    }
}