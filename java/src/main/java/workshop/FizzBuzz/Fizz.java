public class Fizz implements IDivisible {
	private int number;
	Fizz(int number){
		this.number = number;
	}
	public String sayTheWord(){
		return Constant.FIZZ;
	}
	public boolean divides(){
		if(number%3==0 && number%15!=0) return true;
		return false;
	}
}
