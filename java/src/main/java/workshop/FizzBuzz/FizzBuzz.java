public class FizzBuzz implements IDivisible{
	private int number;
	FizzBuzz(int number){
		this.number = number;
	}

	public String sayTheWord(){
		return Constant.FIZZBUZZ;
	}	
	public boolean divides(){
		if(number%15==0) return true;
		return false;
	}
}
