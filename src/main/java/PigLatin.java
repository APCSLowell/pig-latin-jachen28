import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

 public class PigLatin {
    
     public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
      System.out.println("there are " + lines.length + " lines");
      for (int i = 0 ; i < lines.length; i++) {
          System.out.println(pigLatin(lines[i]));
      }
    }
    public int findFirstVowel(String word) {
        for(int i = 0; i < word.length(); i++){
   if(word.substring(i, i+1).equals("a"))
  return i;
   if(word.substring(i, i+1).equals("e"))
  return i;
   if(word.substring(i, i+1).equals("i"))
  return i;
   if(word.substring(i, i+1).equals("o"))
  return i;
   if(word.substring(i, i+1).equals("u"))
  return i;
  }
        return -1;
    }

    public String pigLatin(String word) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        if(findFirstVowel(word) == 0) 
        return word + "ay";
        if(findFirstVowel(word) == 1) 
        return word.substring(1) + word.substring(0,1) + "ay";
        if(findFirstVowel(word) == 2) 
        return word.substring(2) + word.substring(0,2) + "ay";
        if(findFirstVowel(word) == 3) 
        return word.substring(3) + word.substring(0,3) + "ay";
        if(findFirstVowel(word) == 4) 
        return word.substring(4) + word.substring(0,4) + "ay";
        if(findFirstVowel(word) == 5) 
        return word.substring(5) + word.substring(0,5) + "ay";
        if(findFirstVowel(word) == -1) {
        return word + "ay";
      }
      else {
    return "ERROR!";
      }
    }
}
