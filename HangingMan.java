public class HangingMan {

    private int numWrongGuesses=0;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",
        };
        
    public HangingMan(){
        
    }
        
    public boolean isntDead(){
        if(numWrongGuesses<6){
            return true;
        }
        return false;
    }

    public void show(){ //prints out the image of the man to terminal 
    
            System.out.println(HangmanImage[numWrongGuesses]);
        
    }

    public void dieSomeMore(){
        numWrongGuesses++;
    }
    
    
}
