
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    private String tempWord="  ", collect="";
    
    public Puzzle(){ 
        ArrayList words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                tempWord = scanner.next().toUpperCase();
                words.add(tempWord);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private int count=tempWord.length();
    public boolean isUnsolved(){ 
        if(count==0){
            return false;
        }
        return true;
    }

    public void show(){ 
        System.out.print("Puzzle: ");
        for(int i=0; i<tempWord.length(); i++){
            for(int j=0; j<collect.length();j++){
                char letter = collect.charAt(j);
                if(tempWord.charAt(i)==letter){
                    System.out.println(tempWord.charAt(i));
                    count--;
                }
                else{
                    System.out.println("_");
                }
            }
        }
    }

    public boolean makeGuess(String s){ //add to collection of guessed letters, return t/f
        if(tempWord.contains(s)){
            collect = collect + s;
            return true;
        }
        else{
            String pastGuesses = "";
            pastGuesses += "  " + s + " ";
            System.out.print(pastGuesses);
            return false;
        }
    }

    public String getWord(){
        return tempWord;
    }

}
