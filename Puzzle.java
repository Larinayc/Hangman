
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    private String puzzle, guess="", rightGuesses="", wrongGuesses="";

    public Puzzle() {
        ArrayList<String> words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
                words.add(tempWord);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        int l = words.size()-1;
        int i = (int) (Math.random()*l);
        puzzle = words.get(i).toUpperCase();
    }

    public boolean isUnsolved(){ 
        for(int i=0; i<puzzle.length(); i++){
            if(!rightGuesses.contains(puzzle.substring(i,i+1))){
                return true;
            }
        }
        return false;
    }

    public void show(){ 
        System.out.print("Puzzle: ");
        for(int i=0; i<puzzle.length(); i++){
            if(rightGuesses.contains(puzzle.substring(i,i+1))){
                System.out.print(puzzle.substring(i,i+1));
            }
            else{
                System.out.print("_");
            }     
        }
        System.out.println(" ");
        System.out.println("Guesses: " + wrongGuesses);
    }

    public boolean makeGuess(String s){ 
        guess=s.toUpperCase();
        if(puzzle.contains(guess)){
            rightGuesses = rightGuesses + guess;
            return true;
        }
        else{
            wrongGuesses = wrongGuesses + guess + ", ";
            return false;
        }
    }

    public String getWord(){
        return puzzle;
    }

}
