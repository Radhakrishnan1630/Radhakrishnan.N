package leapornot;
import java.util.*;
public class year {
	public static void main(String[]args){
		int year;
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		boolean isleap = false;
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
		            isleap = true;
				}
	                else
	                    isleap = false;
	            }
	            else
	                isleap = true;
	        }
	        else {
	            isleap = false;
	        }

	        if(isleap==true){
	            System.out.println(year + " is a leap Year.");
	        }
	        else{
	            System.out.println(year + " is not a leap Year.");
	        }
	}
}
