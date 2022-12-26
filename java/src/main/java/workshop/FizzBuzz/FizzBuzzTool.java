import java.util.List;

public class FizzBuzzTool {
	private List<IDivisible> divisibleObjectList;

	public FizzBuzzTool(List<IDivisible> divisibleObjectList){
		this.divisibleObjectList = divisibleObjectList;
	}

	public String sayTheWord(int number){
		for(IDivisible divisibleObject : this.divisibleObjectList){
			if(divisibleObject.divides(number)) return divisibleObject.sayTheWord();
		}
		return defaultResponse(number);
	}

	private String defaultResponse(int number){
		return String.valueOf(number);
	}
}
