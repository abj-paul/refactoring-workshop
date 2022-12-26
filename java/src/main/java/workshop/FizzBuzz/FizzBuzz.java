public class FizzBuzz implements IDivisible{
	public String sayTheWord(){
		return Constant.FIZZBUZZ;
	}	
	public boolean divides(int number){
		if(number%15==0) return true;
		return false;
	}
}
