//package workshop.PlaintextToHtmlConverter;

public class Client {
	private final String FILENAME = "sample.txt";
	public void clientFunctio() throws Exception{
		IFileReader fileReader = new FileReader(FILENAME);
		String text = fileReader.readFile();	
		HTMLEncoder htmlEncoder = new HTMLEncoder(text);
		String encodedHTML = htmlEncoder.encode();
		System.out.println(encodedHTML);
	}
}
