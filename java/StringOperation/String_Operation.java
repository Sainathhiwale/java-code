public class String_Operation{
public static void main(String [] args)
{
    String str = "Hello Programmer";
    // Returns the number of characters in the String.
    System.out.println("string length:"+str.length());

    // Returns the character at ith index.
    System.out.println("character 3rd position:"+str.charAt(15));
System.out.println("character 1st position:"+str.charAt(0));


      // Return the substring from the ith  index character
        // to end of string
      System.out.println("Substring :" + str.substring(2));

     // Returns the substring from i to j-1 index.
     System.out.println("Substring " + str.substring(2,7));

     // Concatenates string2 to the end of string1.
     String str1 ="hello";
     String str2 ="programmer";
     System.out.println("string concat :"+str1.concat(str2));
    
      // Returns the index within the string
        // of the first occurrence of the specified string.
        String str4="Learn Share Learn";
        System.out.println("Index of Share: " + 
                           str4.indexOf("Share"));

     // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + 
                           str4.indexOf('a',3));

 // Checking equality of Strings

        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality:  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality : " + out);
  
        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality: " + out);
        String s1 ="hello";
        String s2 ="Hello";
        int out1 = s1.compareTo(s2);
        System.out.println("If s1 = s2" + out);

 //converting lower case
   String word1= "HELLO";
   System.out.println("lowercase :"+word1.toLowerCase());

// converting Uppercase
 String word2 = "hello sainath";
 System.out.println("uppercase :"+word2.toUpperCase());

 // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word 	" + word4.trim());
  // Replacing characters
        String str7 = "feeksforfeeks";
        System.out.println("Original String " + str7);
        String str8 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str8);
} 
}
