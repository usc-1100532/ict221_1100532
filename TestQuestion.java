import java.util.Scanner;

public class TestQuestion{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		
		
		int x;
		int y;
		String z;
		
		
		int firstNumber;
		int secondNumber;
		String operator;
		int result=0;
		
		System.out.println("Enter the first number: ");
		x = scanner.nextInt();
		System.out.println("Enter the second number: ");
		y = scanner.nextInt();
		System.out.println("Enter the operator: ");
		z = scanner.next();
		
		Question q = new Question(x, y, z);		
		firstNumber = q.getValue1();
		secondNumber = q.getValue2();		
		operator = q.getOperator();		
		if(operator.equals("+")){
			result = firstNumber + secondNumber;
		}else if(operator.equals("-")){
			result = firstNumber - secondNumber;
		}else if(operator.equals("*")){
			result = firstNumber * secondNumber;				
		}else if(operator.equals("-")){
			result = firstNumber - secondNumber;
		}
			
		System.out.println(result);
		
	}
}