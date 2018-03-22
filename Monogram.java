import java.util.Scanner;

public class Monogram {

	public static void main(String[] args) {
		
		int index=0;
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter your full name with blanks sir: ");
		String fullName = cin.nextLine()+" ";
		String monogram="";
		while(fullName.length()!=0 && index != -1)
		{
		monogram +=fullName.substring(0,1);
		index = fullName.indexOf(" ");
		fullName=fullName.substring(index+1,fullName.length());
		monogram +=" ";
		}
		System.out.println ("Your name's monogram is:  "+ monogram );
	}
}
