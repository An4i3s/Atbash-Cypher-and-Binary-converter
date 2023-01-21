import java.util.Scanner;


public class AtbashCypher {

    public  String atbashCypher(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the plain text: ");
        String text = keyboard.nextLine();

        //turn the plainText to Upper Case
        //turn the upper case text to an array of Char
        char[] textArray = text.toUpperCase().toCharArray();
        //loop the array of Char
        String cypheredString = "";
        for (int i = 0; i< textArray.length; i++){
            int cypheredLetter = ('Z' - textArray[i]) + 'A';
            System.out.println("cyphered letter: "+cypheredLetter);
            char asciiToChar = (char) cypheredLetter;
            System.out.println("asciiToChar: "+asciiToChar);
            cypheredString += asciiToChar;
        }
        return "the cyphered version is: "+cypheredString;

    }
}
