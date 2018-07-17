package alp;
import java.util.*;
public class alp {
	public static void main(String[]args){
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		if((c>='a' && c<='z') || (c>='A' && c<='Z')){
			System.out.println("the given character is an Alphabets");
		}else
		{
		System.out.println("N0");
		}
	}
}
