import java.util.*;
class CharacterCheck{
	public static void check(char ch){
		if(ch>33 && ch<65){
			System.out.println("Upper Case");
		}else{
			System.out.println("I dont know");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		check(ch);
	}
}