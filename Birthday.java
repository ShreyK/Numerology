
//This is the Calculating Class that provides the structure of the person whose Numerology
//one is doing and calculates their life,birth numbers and their yearly records.

public class Birthday
{
	int d,m,y,birthstar, lifestar, a;
	
	public Birthday(int day, int month, int year) 
	{//The Structure
		d= day;
		m = month;
		y = year;
		
	}
	public int UnitCalculator(int num)					//Lets say num =4444
	{ //An Algorithm to find all units in a number and assig them values
		
			int num1 = num/1000;						// 4444/1000 = 4 
			int numbercut1 = num%1000;					// 4444%1000 = 444
			int num2 = numbercut1/100;					// 444/100   = 4
			int numbercut2 = num%100;					// 4444%100  = 44
			int num3 = numbercut2/10;					// 44/10     = 4
			int num4 = numbercut2%10;					// 44%10     = 4

			int number = num1 + num2 +num3 + num4;		//  4+4+4+4 = 16
			int number1 = number/10;					//  16/10 = 1
			int number2 = number%10;					//	16%10 = 6
			number = number1 + number2;					//	1 +6 = 7
			return number;								//THIS WORKS ON 4,3,2 DIGITS
	}
	public void CalculateBirthday() 
	{//Using the UnitCalculator, this method finds the life,birth numbers.
		
		d = UnitCalculator(d);			
		
		m = UnitCalculator(m);	 
	
		y= UnitCalculator(y); 		 
			 
		birthstar = d;	  // d = 5
		lifestar = d + m + y; // d+m+y = 16
		lifestar = UnitCalculator(lifestar);
	}
	
	public String AgeCalculate(int age)
	{//Using the last two methods this method finds the yearly records for Numerology.	
		a = age;
		//AGE CALCULATION Lets say age is 18(THEN THEIR CURRENT NUMEROLOGY AGE IS 19!!)
	
		a = a+1;
		
		int a1 = a/10;     // 19/10 = 1
		a1 = UnitCalculator(a1);
		
		int a2 = a%10;     // 19%10 = 9
		a2 = UnitCalculator(a2);
		
		int a3 = lifestar; //     = 7
		
		int a4 = a1+a2;    // 1+9 = 1
		a4 = UnitCalculator(a4);
		
		int a5 = a2 + a3;  // 9+7 
		a5 = UnitCalculator(a5);
		
		int a6 = a4 + a5;  // 2+7 = 9
		a6 = UnitCalculator(a6);
		
		return a1+""+a2+""+a3+""+a4+""+a5+""+a6+"";
		
	}
}