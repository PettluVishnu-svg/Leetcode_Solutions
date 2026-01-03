import java.util.*;
class ValidTriangle{
	static Boolean check(int a,int b,int c){
		if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
			return true;
		}
	 return false;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first size:");
		int a=sc.nextInt();
		System.out.println("Enter second size:");
		int b=sc.nextInt();
		System.out.println("Enter third size:");
		int c=sc.nextInt();
		Boolean bool=check(a,b,c);
		System.out.println("Valid traingle:");
	}
}