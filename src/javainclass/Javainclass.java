
package javainclass;

import java.util.Scanner;

public class Javainclass {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any word");
        String anyword=input.next();
        char[] reverse=new char[anyword.length()];
       // seperate char from word.then save in array
       for(int i=0;i<anyword.length();i++)
       {
       reverse[i]=anyword.charAt(i);
       }
       for (int i=reverse.length-1;i>=0;i--)
       {
           System.out.print(reverse[i]);
       }
    }
    
}
