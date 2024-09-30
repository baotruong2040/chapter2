package Ex1;

import java.lang. Character;
public class Charac {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Character ch = new Character('a');
        Character bt = new Character('B');
        //method isLetter (1)
        System.out.println(Character.isLetter(ch));
        //method isDigit(2)
        System.out.println(Character.isDigit(ch));
        //method isWhitespace(3)
        System.out.println(Character.isWhitespace(ch));
        //method isUpperCase and isLowerCase(4,5)
        System.out.println(Character.isUpperCase(ch));
        
        System.out.println(Character.isLowerCase(bt));
        //method toUpperCase and toLowerCase(6,7)
        System.out.println(Character.toUpperCase(ch));
        
        System.out.println(Character.toLowerCase(bt));
        //method compareTo(8)
        System.out.println(ch.compareTo(bt));
        //method equals(9)
        System.out.println(ch.equals(bt));
        //method to toString(10)
        String charToString = Character.toString(bt);
        System.out.println(charToString);
    }
    
} 