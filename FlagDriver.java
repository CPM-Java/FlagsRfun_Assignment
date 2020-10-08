/**
 * Flag Driver DO NOT MODIFY THIS CLASS
 * 
 * @GrayKnight
 * @1/3/18, 1/24/19
 */

import java.util.Scanner;

public class FlagDriver
{

    private Scanner scan = new Scanner(System.in);
    private Flag flag1, flag2;
    
    /**
     * driver Method
     * Surveys the user for preferences regarding the instance flag type and size
     * DO NOT MODIFY
     */
    public void driver()
    {
        int numRows1, numRows2 = 5;
        int flagNum1, flagNum2 = 1;
        boolean sentinel = true;
        
        while(sentinel){
         System.out.print("This program will create and display two flags.\n" +
                          "Choose from the following:\n" +
                          "Nautical Signal Flags:\n" + 
                          "\t1) Echo, I am altering my course to starboard.\n" +
                          "\t2) Kilo, I wish to communicate with you.\n" +
                          "\t3) Oscar, Man Overboard!\n" +
                          "\t4) Victor, I require assistance.\n" +
                          "\t5) Yankee, I am dragging my anchor.\n" +
                          "\t6) Xray, Stop carrying out your intentions and watch for my signals.\n" +                  
                          "\t7) Zulu, I require a tug\n" +
                          
                          "National Flags:\n" +                  
                          "\t8) Great Britain, Union Jack\n" +
                          "\t9) USA, Old Glory\n" +
                          
                          "Exit:   0) Exit\n" +
                          "\tFirst Flag Choice: ");
                          
         flagNum1 = scan.nextInt();
         if (flagNum1 > 0 && flagNum1 <= 9){ //enforcing conditions
           System.out.print("Enter the first flag size (odd number of rows):");
           numRows1 = scan.nextInt();
           
           //For simplicity, the flag arrays are always square 
           //with an odd number of row and columns.
           if (numRows1 < 7) numRows1 = 7;
           if (numRows1 > 19) numRows1 = 19; //setting size limits
           if (numRows1%2 == 0) numRows1++; //make numRows and numCols odd
           
           System.out.print("Second Flag Choice: ");
           flagNum2 = scan.nextInt();
           if (flagNum2 > 0 && flagNum2 <= 9){ //enforcing conditions
              System.out.print("Enter the second flag size (odd number of rows):");
              numRows2 = scan.nextInt();
         
              if (numRows2 < 7) numRows2 = 7;
              if (numRows2 > 19) numRows2 = 19; //setting size limits
              if (numRows2%2 == 0) numRows2++; //make numRows and numCols odd
         
              this.makeFlags(flagNum1,numRows1, flagNum2, numRows2);
              String comparisonStr = "These Flags are NOT the same.";
              if(flag1.equals(flag2)) comparisonStr = "These Flags are the same.";
              System.out.println(FlagDisplay.flags2Str(flag1, flag2, comparisonStr));
           }
           else sentinel = false;
        }
       
        else sentinel = false;
         
      }//end of while
                     
       System.out.println("Goodbye\n");
    }
    
    
    //helper method to construct 2 Flag objects
    private void makeFlags(int type1, int size1, int type2,int size2)
    {
        String[][] strAry1 = new String[size1][size1];
        for(int row = 0; row < strAry1.length; row++)
           for(int col = 0; col < strAry1.length; col++)
              strAry1[row][col] = "  ";
              
        flag1 = new Flag(type1, strAry1);
              
              
        String[][] strAry2 = new String[size2][size2];
        for(int row = 0; row < strAry2.length; row++)
           for(int col = 0; col < strAry2.length; col++)
              strAry2[row][col] = "  ";
              
        flag2 = new Flag(type2, strAry2);      
        
    }
 

}