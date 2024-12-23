import java.util.*;
class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a sentence: "); 
        String input = scanner.nextLine(); 

      
        int wordCount = countWords(input);

      
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

    
    public static int countWords(String str) {
        
        str = str.trim();

        
        if (str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+"); 
        return words.length; 
    }
}
