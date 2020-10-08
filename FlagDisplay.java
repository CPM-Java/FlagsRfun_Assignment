
/**
 * Static helper that makes a string representation of 2 Flag objects
 * DO NOT MODIFY
 * 
 * @author GK CPM 
 * @version 1/24/19
 */
public class FlagDisplay
{
    /**
     * Displays two flags with a message between them
     * 
     * @param  flagA   first square flag
     * @param  flagB   second square flag
     * @param  messageStr   a String message displayed between the flags
     * @return     a String representation of two Flags 
     */
    public static String flags2Str(Flag flagA, Flag flagB, String messageStr)
    {
        String display = "";
        String display2 = "";
        String[][] arrayA = flagA.getStringArray();
        int sideLenA = arrayA.length;
        String[][] arrayB = flagB.getStringArray();
        int sideLenB = arrayB.length;
        
        int flagWidth = 0;
        
        for (int row = 0; row < sideLenA; row++){
           display += "|";
           for (int col  = 0; col  < sideLenA; col++) { 
              display += arrayA[row][col] + " ";
           }
           display = display.substring(0,display.length() - 1) + "|";
           if(row == 0) flagWidth = display.length();
           if(row == sideLenA/2) display += " " + flagA.toString() + "\n";
           else display += "\n";
        }
      
        //top edge
        String topEdgeStr = "";
        for (int x  = 0; x < flagWidth-1; x++) topEdgeStr += "_";      
        display = topEdgeStr + "\n" + display;
        //bottom edge
        for (int x  = 0; x < flagWidth-1; x++) display += "-";      
           //display += "\n";
           
        display +=    "\n\t" + messageStr + "\n";
        
        for (int row = 0; row < sideLenB; row++){
           display2 += "|";
           for (int col  = 0; col  < sideLenB; col++) { 
              display2 += arrayB[row][col] + " ";
           }
           display2 = display2.substring(0,display2.length() - 1) + "|";
           if(row == 0) flagWidth = display2.length();
           if(row == sideLenB/2) display2 += " " + flagB.toString() + "\n";
           else display2 += "\n";
        }
      
        //top edge
        topEdgeStr = "";
        for (int x  = 0; x < flagWidth-1; x++) topEdgeStr += "_";      
        display2 = topEdgeStr + "\n" + display2;
        //bottom edge
        for (int x  = 0; x < flagWidth-1; x++) display2 += "-";      
           display2 += "\n";
        
        return display + display2;
    }
}
