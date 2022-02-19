package CapGeminiDesafios; 

import java.util.Arrays;

public class DesafioCapGemini03 { 
	
    public static boolean isAnagrama(String string1, String string2) {
    	if (string1 == null || string2 == null)
    		return false;
    	if (string1.length() != string2.length())
    		return false;
    	string1 = string1.toLowerCase();
    	string2 = string2.toLowerCase();
    	
    	char [] tempString1 = string1.toCharArray();
    	char [] tempString2 = string2.toCharArray();
    	
       	Arrays.sort(tempString1);
       	Arrays.sort(tempString2);
       	
       	Arrays.equals(tempString1, tempString2);
       	
       	System.out.println(Arrays.toString(tempString1));
       	System.out.println(Arrays.toString(tempString2));
       	
       	return Arrays.equals(tempString1, tempString2);
    }

	public static void main(String[] args) {
	
		System.out.println("É anagrama as Strings: " + isAnagrama("ovo", "ovo"));		
	}
 }		
