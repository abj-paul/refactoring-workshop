import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader implements IFileReader {
	private String fileName;
	FileReader(String fileName){
		this.fileName = fileName;
	}

	public String readFile() throws Exception {
		return new String(Files.readAllBytes(Paths.get(this.fileName)));
	}
}
