package Gugudan;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 2단
		System.out.println("출력할 구구단은 ? : ");
		Scanner scanner =new Scanner(System.in); 
		int number = scanner.nextInt();
		
		System.out.println("사용자가 입력한 값은?> " + number);
		
		if(number > 9 || number < 2){
			System.out.println("값을 잘 못 입력했습니다. ");
			return;
		}
		
		for(int i=1;i<10;i++){
			System.out.println(number +" * " + i +" = "+ number * i);
		}
		
	}
	
}
