import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("words.txt");
		BufferedReader bf = null;
		
		//Binary Tree to store String objects
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		
		try {
			bf = new BufferedReader(new FileReader(file));
			String line = bf.readLine();
			while(line != null) {
				tree.insert(line);
				line = bf.readLine();
			} 	
		}catch(FileNotFoundException e) {
			System.err.print("Error");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
