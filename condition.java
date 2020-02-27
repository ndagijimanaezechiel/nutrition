import java.util.Scanner;
public class condition{

	public static void main(String[] args){
		Scanner MYobject = new Scanner(System.in);
		System.out.println("Enter a number");
		int number= MYobject.nextInt();
		if(number == 5){
			System.out.println("is five");
		}else{
			System.out.println(" is not five");
		}
	}
};