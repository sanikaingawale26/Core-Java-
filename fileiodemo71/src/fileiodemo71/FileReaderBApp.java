package fileiodemo71;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderBApp {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("BData.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
