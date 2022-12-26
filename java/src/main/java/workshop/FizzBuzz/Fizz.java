public class Fizz implements IDivisible {
	public String sayTheWord(){
		return Constant.FIZZ;
	}
	public boolean divides(int number){
		if(number%3==0 && number%15!=0) return true;
		return false;
	}
}
