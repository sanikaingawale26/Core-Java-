package fileiodemo71;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("data.txt");
			int ch = fileReader.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fileReader.read();// character by character read
				// if the character is -1=>EOF
			}

			fileReader.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		}

	}

}
