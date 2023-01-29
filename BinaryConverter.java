import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an int");
        int numberToConvert = scanner.nextInt();
        System.out.println(convertBinary(numberToConvert));
        System.out.println("#######################");
        System.out.println("#######################");
        System.out.println("Enter a word");
        String text = scanner.next();
        System.out.println(convertWords(text));
    }

    public static String convertBinary (int userInput){
        String binaryResult = "";
        while (userInput >0 ){
            if(userInput%2 == 0){
                binaryResult += "0";
            }else {
                binaryResult+= "1";
            }
            userInput = userInput/2;
        }

        char[] binaryResultArray = binaryResult.toCharArray();
        String reversedBinary = "";
        for (int i = binaryResult.length()-1; i > 0-1; i--){
            char x = binaryResultArray[i];

            reversedBinary += x;
        }
        return reversedBinary;
    }

    public static String convertWords(String text){
        String binaryResult = "";
        char[] textArray = text.toCharArray();
        for (int i = 0; i<text.length(); i++){
            int asciiValue = (int) textArray[i];
            binaryResult += convertBinary(asciiValue);
            binaryResult += " ";
        }
        return binaryResult;
    }
}
