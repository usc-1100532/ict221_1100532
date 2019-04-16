public class Question{
	private int value1;
	private int value2;
	private String operator;
	private int answer;
	
	public Question(int value1, int value2, String operator){
		this.value1 = value1;
		this.value2 = value2;
		this.operator = operator;	
		
	}
	/*
	public Question(Random rand){
		
	}
	*/
	
	public void showQuestion(){
		
	}
	
	public boolean checkAnswer(int response){
		return false;
	}
	
	public int getValue1(){
		return value1;
	}
	
	public int getValue2(){
		return value2;
	}
	public String getOperator(){
		return operator;
	}
	
	
}
