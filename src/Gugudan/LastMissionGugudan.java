package Gugudan;
import java.util.Scanner;

public class LastMissionGugudan {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("번호를 입력하세요! : " );
		String number=scanner.nextLine();
		String[] numberSplit;
		numberSplit=number.split(",");
		int first=Integer.parseInt(numberSplit[0]);
		int second=Integer.parseInt(numberSplit[1]);
		
	
		System.out.println("첫 입력 " + first +"//" + second);
		
		
		for(int i=2;i<=first;i++){
			for(int x=1;x<=second;x++){
				
				System.out.println( i + " * " + x + " = " + i*x );
				
			}
			
			
		}
		
	}  
}
