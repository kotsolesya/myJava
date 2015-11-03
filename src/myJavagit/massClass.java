package myJavagit;

public class massClass {


	public void createmass(int Amass[], int n)
	{
		for (int i=0; i<n; i++)
		Amass[i]= (int)Math.round(Math.random()*100);
	}
	
	
	public void printmass(int Amass[], int n)
	{				
		for (int i=0; i<n; i++)
			System.out.print(Amass[i]+" ");
		
	}
	
	
	
	
}
