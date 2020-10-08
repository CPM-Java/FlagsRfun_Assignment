
/**
 * Demonstration of class FlagMaker
 * 
 * @author GrayKnight 
 * @version 1/3/18
 */
public class Flag
{
    private String[][] myPatternStrArray;
    private String myFlagDescrStr = "I surrender!";
    
   /**
     * Accepts a 2-D array of Strings and saves it as an intance variable,
     * and an integer representing a specific flag type.
     * Fills the 2-D array with strings representing the specified flag pattern
     * 
     * @param  array   a 2-D array of Strings
     */
    public Flag(int flagType, String[][] flagArray)
    {
        myPatternStrArray = flagArray;
        if (flagType == 1) this.echo(); //Echo, I am altering my course to starboard.
        if (flagType == 2) this.kilo(); //Kilo, I wish to communicate with you.
        if (flagType == 3) this.oscar(); //Oscar, Man Overboard
        if (flagType == 4) this.victor(); //Victor, I require assistance
        if (flagType == 5) this.yankee(); //Yankee, I am dragging my anchor
        if (flagType == 6) this.xray(); //Xray, Stop carrying out your intentions and watch for my signals       
        if (flagType == 7) this.zulu(); //Zulu, I require a tug.
        
        if (flagType == 8) this.britain(); //Great Britain, Union Jack.
        if (flagType == 9) this.usa(); //USA, Old Glory.
       
    }
    
    //Echo, I am altering my course to starboard.
    private void echo()
    {
      myFlagDescrStr = "Echo, I am altering my course to starboard.";
      for (int row = 0; row < myPatternStrArray.length; row++){
        for (int col = 0; col < myPatternStrArray[0].length; col++) { 
          if (row == myPatternStrArray.length/2)
            myPatternStrArray[row][col] = "B_";
          else if (row == myPatternStrArray.length/2 - 1)
            myPatternStrArray[row][col] = "R_";
          else
            myPatternStrArray[row][col] = "R ";
        }
      }        
    }
    
    //Kilo, I wish to communicate with you.
    private void kilo()
    {
      myFlagDescrStr = "Kilo, I wish to communicate with you.";
      for (int row = 0; row < myPatternStrArray.length; row++){
        for (int col = 0; col < myPatternStrArray[0].length; col++) { 
         if (myPatternStrArray[0].length/2 == col)
            myPatternStrArray[row][col] = "|";
         else if (myPatternStrArray[0].length/2 < col)
            myPatternStrArray[row][col] = "YY";
         else
            myPatternStrArray[row][col] = "BB";
        }
      }
    }
    
    //Oscar, Man Overboard!
    private void oscar()
    {
      myFlagDescrStr = "Oscar, Man Overboard!";
      for (int row = 0; row < myPatternStrArray.length; row++){
        for (int col = 0; col < myPatternStrArray[0].length; col++) { 
          if (row < col )
            myPatternStrArray[row][col] = "R";
          else if (row == col )
            myPatternStrArray[row][col] = "\\";
          else
            myPatternStrArray[row][col] = "Y";          
        }
      }
    }
    
    //Victor, I require assistance.
    private void victor()
    {
      myFlagDescrStr = "Victor, I require assistance.";
      for (int row = 0; row < myPatternStrArray.length; row++){
        for (int col = 0; col < myPatternStrArray[0].length; col++) { 
          if (myPatternStrArray[0].length - row - 1 == col && row == col)
            myPatternStrArray[row][col] = "> R <";
          else if (myPatternStrArray[0].length - row - 1 == col)
            myPatternStrArray[row][col] = "/R/";
          else if (row == col)
            myPatternStrArray[row][col] = "\\R\\";
          else
            myPatternStrArray[row][col] = " ";//white
        }
      }
    }
    
    //Yankee, I am dragging my anchor.
    private void yankee()
    {
      myFlagDescrStr = "Yankee, I am dragging my anchor. (unfinished)";

    }
            
    //Xray, Stop carrying out your intentions and watch for my signals.
    private void xray()
    {
      myFlagDescrStr = "Xray, Stop carrying out your intentions and watch for my signals. (unfinished)";

    }
    
        
    //Zulu, I require a tug.
    private void zulu()
    {
      myFlagDescrStr = "Zulu, I require a tug. (unfinished)";

    }
    
    
    //National Flags
    
    //Great Britain, Union Jack
    private void britain()
    {
      myFlagDescrStr = "Great Britain, Union Jack (unfinished)";
        
    }
    
    // USA, Old Glory
    //Notice that there are always 7 "equally space" red stripes
    //Notice that there are a maximum of 50 "equally spaced" stars
    private void usa()
    {
      myFlagDescrStr = "USA, Old Glory (unfinished)";

    }
    
    //Getter Method
    /**
     * Accessor method for the instance 2-D String array
     * 
     * @return  the instance 2-D String array
     */
    public String[][] getStringArray()
    {
        return myPatternStrArray;
    }
    
    /**
     * Compares Flag instance 2-D String array sizes and contents
     * 
     * @return     true if content and size are equal otherwise false 
     */
    public boolean equals(Flag nextFlag)
    {
        //COMPLETE THIS METHOD FIRST
        
                 
        return true; //just so it compiles
    }
    
    /**
     * toString
     * 
     * @return     A String naming the flag type 
     */
    public String toString()
    {
        return myFlagDescrStr;
    }


}
