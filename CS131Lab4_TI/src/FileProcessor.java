import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList ;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		setFileName(fileName);
		if(stringLength < 5) {
			setStringLength(5);			
		}
		else{
			setStringLength(stringLength);		
		}
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringList.size();		
	}//end getArrayListSize
	
	public void processFile() {
		try {
			input = new Scanner(new FileInputStream(fileName));
			while(input.hasNextLine()) {
				String string = input.nextLine();
				if(string.length() > stringLength) {
					throw new StringTooLongException("String is too long!");
				}
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Cannot find " + fileName);
		} 
		catch (StringTooLongException excpt) {
			System.out.println(excpt.getMessage());
		}
		
		
	}//end processFile

	/**
	 * @return the current value of fileName
	 */
	public String getFileName() {
		return fileName;
	}//end getFileName

	/**
	 * @param fileName the value of fileName to be set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}//end setFileName

	/**
	 * @return the current value of stringLength
	 */
	public int getStringLength() {
		return stringLength;
	}//end getStringLength

	/**
	 * @param stringLength the value of stringLength to be set
	 */
	public void setStringLength(int stringLength) {
		this.stringLength = stringLength;
	}//end setStringLength
}//end class
