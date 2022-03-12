import java.io.*;
import java.util.Scanner;

/**
 * SpellChecker Project
 * @author Ian MacLeod
 * @date 3/12/22
 *
 */
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
				System.out.print("Please enter a word or sentence:\n");
				String words = scan.nextLine();
				if(words.equals("end")) {
					go = false;
				}
	
				for(int i = 0; i < words.split(" ").length; i++) {
					String wordToFind = tree.find(words.split(" ")[i].toLowerCase().replaceAll("\\p{Punct}", ""));
					if(wordToFind == null) {
						System.out.println(words.split(" ")[i] + " is not spelled correctly");
					}
				}
				
				System.out.println("");
			}
		}catch(FileNotFoundException e) {
			System.err.print("Error");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
