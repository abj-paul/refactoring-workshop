public class Buzz implements IDivisible {
	public String sayTheWord(){
		return Constant.BUZZ;
	}
	public boolean divides(int number){
		if(number%5==0 && number%15!=0) return true;
		return false;	
	}
}
