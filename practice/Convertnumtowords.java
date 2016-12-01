import java.util.Scanner;


public class Convertnumtowords {
	public void power(int n, String ch){
	    String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};    
	    String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};

	    if(n>19)
		{
			System.out.print(ten[n/10]+ " " +one[n%10]);
		}
		else
		{
			System.out.print(one[n]);
		}
		if(n > 0)System.out.print(ch);
	}

	public static void main(String args[]){
		int n=0;
		Scanner scanf = new Scanner(System.in);
		System.out.println("Enter a integer");
		n = scanf.nextInt();
		if(n <=0)
			System.out.println("Enter number greater than 0");
	
	else{
		Convertnumtowords number = new Convertnumtowords();
		number.power((n/1000000000),"Hundered");
		number.power((n/10000000)%100," crore");
		number.power((n/100000)%100," lakh");
		number.power((n/1000)%100," thousand");
		number.power((n/100)%10," hundered");
		number.power((n%100)," ");
		
		
		
		
	}	
	}
	
	
	
}
