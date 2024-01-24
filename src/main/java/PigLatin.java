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
    public int findFirstVowel(String sWord) {
        / for(int i = 0; i < sWord.length(); i++){
   if(sWord.substring(i, i+1).equals("a"))
  return i;
   if(sWord.substring(i, i+1).equals("e"))
return i;   
if(sWord.substring(i, i+1).equals("i"))
  return i;
   if(sWord.substring(i, i+1).equals("o"))
  return i;
   if(sWord.substring(i, i+1).equals("u"))
  return i;
  }
        return -1;
    }

    public String pigLatin(String sWord) {
        if(findFirstVowel(sWord) == 0) 
  return sWord + "way";
  if(sWord.substring(0,2).equals("qu"))
  return sWord.substring(2) + sWord.substring(0,2) + "ay";
  if(findFirstVowel(sWord) == 1) 
  return sWord.substring(1) + sWord.substring(0,1) + "ay";
  if(findFirstVowel(sWord) == 2) 
  return sWord.substring(2) + sWord.substring(0,2) + "ay";
  if(findFirstVowel(sWord) == 3) 
  return sWord.substring(3) + sWord.substring(0,3) + "ay";
	    if(findFirstVowel(sWord) == -1) {
		    return sWord + "ay";
	    }
	    else {
		return "ERROR!";
	    }
    }
}//end PigLatin class
