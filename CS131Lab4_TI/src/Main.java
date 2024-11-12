
public class Main {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor("GoodString.txt", 5);
		fileProcessor.processFile();
		fileProcessor = new FileProcessor("BadString.txt", 5);
		fileProcessor.processFile();
	}
}
