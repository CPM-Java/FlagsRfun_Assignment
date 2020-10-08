Flag

constructor
public Flag(int flagType, String[][] flagArray)
Accepts a 2-D array of Strings and saves it as an intance variable, 
 and an integer representing a specific flag type. 
 Fills the 2-D array with strings representing the specified flag pattern.
Parameters:
array - a 2-D array of Strings

equals
public boolean equals(Flag nextFlag)
Compares Flag instance 2-D String array sizes and contents
Returns:
true if content and size are equal otherwise false

getStringArray
public String[][] getStringArray()
Accessor method for the instance 2-D String array
Returns:
the instance 2-D String array

toString
public String toString()
toString
Returns:
A String naming the flag type