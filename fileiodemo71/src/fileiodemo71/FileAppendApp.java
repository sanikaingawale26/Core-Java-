package fileiodemo71;

import java.io.FileWriter;

public class FileAppendApp {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("data.txt", true);
			fileWriter.write("\nLine 1");
			fileWriter.write("\nLine 2");
			fileWriter.write("\nLine 3");
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
