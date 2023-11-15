package week_10.assigments;

public class Question_10_24 {
    public static void main(String[] args) {
        MyCharacter character = new MyCharacter('A');
        System.out.println(character);
        System.out.println(character.toLowerCase());
        System.out.println(character.toUpperCase());
        System.out.println(character.isDigit());
        System.out.println(character.isLetter());
        System.out.println(character.isLetterOrDigit());
        System.out.println(new MyCharacter('2'));
    }
}
