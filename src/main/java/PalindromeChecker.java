import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
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
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  char []abc={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  String Pawn="";
   for (int i=word.length()-1;i>=0;i--){
   for (int c = 0; c <= 26; c++) {
    if (word.charAt(i)==abc[c]) 
      Pawn =word.substring(i,i+1)+Pawn;
   }
   }
  //your code here
  return Pawn.equalsIgnoreCase(reverse(Pawn));
}
     
public String reverse(String str)
{
    String ans = new String();
  for (int i=str.length()-1;i>=0;i--){
    
   
  ans=ans+str.substring(i,i+1);
    
  }
  return ans;
}
}
