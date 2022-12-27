public class Buzz implements IDivisible {
	private int number;
	Buzz(int number){
		this.number = number;
	}

	public String sayTheWord(){
		return Constant.BUZZ;
	}
	public boolean divides(){
		if(number%5==0 && number%15!=0) return true;
		return false;	
	}
}
