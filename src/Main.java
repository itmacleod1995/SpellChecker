import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("words.txt");
		BufferedReader bf = null;
		Scanner scan = new Scanner(System.in);
		
		//Binary Tree to store String objects
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		
		try {
			bf = new BufferedReader(new FileReader(file));
			String line = bf.readLine();
			while(line != null) {
				tree.insert(line);
				line = bf.readLine();
			} 
			
			System.out.println("Height is " + tree.height());
			boolean go = true;
			while(go) {
				String words = scan.nextLine();
	
				for(int i = 0; i < words.split(" ").length; i++) {
					String wordToFind = tree.find(words.split(" ")[i]);
					if(wordToFind == null) {
						System.out.println(words.split(" ")[i] + " is not spelled correctly");
					}
				}
				
				go = false;
			}
		}catch(FileNotFoundException e) {
			System.err.print("Error");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
