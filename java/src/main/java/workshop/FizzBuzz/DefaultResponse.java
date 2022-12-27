public class DefaultResponse implements IDivisible{
	private int number;
	DefaultResponse(int number){
		this.number = number;	
	}
	public String sayTheWord(){
		return String.valueOf(number);
	}

	public boolean divides(){
		return number%3!=0 && number%5!=0;	
	}
	
}
