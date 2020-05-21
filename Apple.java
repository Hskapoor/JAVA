package bucky;
import java.util.Scanner;
public class Apple {

	static long  tax;
	long income;
	String name;
	
      static long calculateTax(String name,long income)
    { 
	
	if(income>=300000)
	{ 
	    tax = (income*20)/100;
	    System.out.println("TAX IS "+tax);
	    
	}
	else if(income>=100000&&income<300000)
	{ 
		 tax = (income*10)/100;
		 System.out.println("TAX IS "+tax);
	}
	else
	 tax =0;
	
	return tax;
	
}
	public static void  main(String[] args) {
		int i=1;
		int no =0;
		
		System.out.println("TAX CALCULATOR APP");
		System.out.println("----WELCOME----");
		
		System.out.println("Enter Total Person Count");
		
		Scanner myObj =  new Scanner(System.in);
		 
         no = myObj.nextInt();
         
         String arrayPerson[]= new String[no];
         long arrayIncome[]= new long[no];
         int j=1;
		for (i=0;i<no;i++)
		{ 
			System.out.println("Enter the Name " +j+ ":");
			 arrayPerson[i] = myObj.next();
			System.out.println("Enter the " +arrayPerson[i]+ " Total Income ");
			 arrayIncome[i] = myObj.nextLong(); 
			 j++;
			 
		}
		for(i=0;i<no;i++) { 
			System.out.println();
			System.out.println("Names are "+arrayPerson[i]);
			System.out.println("Incomes are "+arrayIncome[i]);
			System.out.println();	
		
		calculateTax(arrayPerson[i],arrayIncome[i]);
		}
		
		
		
		
		
		
	}
}
	
		 
	

