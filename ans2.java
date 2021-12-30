import java.util.*;

class ArrayX
{
    public int Arr1[];
    public int Arr2[];

    public ArrayX(int iSize1, int iSize2)
    {
    	Arr1 = new int[iSize1];
    	Arr2 = new int[iSize2];
    }

    public void Accept()
    {
    	Scanner sobj = new Scanner(System.in);
    	int iCnt =0;

    	System.out.println("Enter elements of 1st Array");
        for(iCnt =0; iCnt< Arr1.length; iCnt++)
        {
        	Arr1[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter elements of 2nd Array");
        for(iCnt =0; iCnt< Arr2.length; iCnt++)
        {
        	Arr2[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
    	int iCnt=0;

    	System.out.println("elements are Arr1 : ");
    	for (iCnt =0; iCnt < Arr1.length ; iCnt++) 
    	{
    		System.out.println(Arr1[iCnt]);
    	}

    	System.out.println("elements are Arr2 : ");
    	for (iCnt =0; iCnt < Arr2.length ; iCnt++) 
    	{
    		System.out.println(Arr2[iCnt]);
    	}
    }
}

class Marvellous extends ArrayX
{
	public Marvellous(int iValue1, int iValue2)
	{
		super(iValue1, iValue2);
	}

    public void DisplayEv()
    {
        int i=0;
        
        System.out.println("Even number from Arr1 are : ");
        for (i=0; i < Arr1.length ; i++)
        {
            if((Arr1[i] % 2) == 0)
            {
                System.out.println(Arr1[i]);
            } 
        }
        
        System.out.println("Even number from Arr1 are : ");
        for (i=0; i < Arr2.length ; i++)
        {
            if((Arr2[i] % 2) == 0)
            {
                System.out.println(Arr2[i]);
            } 
        }
    }
}
class ans2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
        int iLength1=0, iLength2=0;

		System.out.println("Enter the number of elements for 1st array");
		iLength1 = sobj.nextInt();

		System.out.println("Enter the number of elements for 2nd array");
		iLength2 = sobj.nextInt();
        
        Marvellous mobj = new Marvellous(iLength1,iLength2);
        mobj.Accept();
        
        mobj.Display();

        mobj.DisplayEv();

	}
}