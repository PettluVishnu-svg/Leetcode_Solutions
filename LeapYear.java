import java.util.*;
class LeapYear{
	public static void leapYear(int n){
		if(n%400==0){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not lear year");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		leapYear(n);
	}
}