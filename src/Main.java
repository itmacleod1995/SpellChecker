import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("words.txt");
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
			int count = 1;
			String line = bf.readLine();
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
				count++;
			}
			
			System.out.println("Total word count = " + count);
		}catch(FileNotFoundException e) {
			System.err.print("Error");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
