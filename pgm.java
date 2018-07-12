package alphabetsorder;
import java.util.Scanner;
public class javaprogram {
	    public static void main(String[]args){
	    {
	        int i, j;
	        String temp;
	        Scanner scan = new Scanner(System.in);
	        
	        String names[] = new String[5];
			
	        System.out.print("Enter  Names/Words : ");
	        for(i=0; i<5; i++)
	        {
	            names[i] = scan.nextLine();
	        }
	        for(i=0; i<5; i++)
	        {
	            for(j=1; j<5; j++)
	            {
	                if(names[j-1].compareTo(names[j])>0)
	                {
	                    temp=names[j-1];
	                    names[j-1]=names[j];
	                    names[j]=temp;
	                }
	            }
	        }
	        for(i=0;i<5;i++)
	        {
	            System.out.println(names[i]);
	        }
	    }
	}

}
