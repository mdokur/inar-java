package week_10.assigments;

public class MyCharacter {
    private char character;

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public MyCharacter() {

    }

    public MyCharacter(char ch) {
        this.character = ch;
    }

    public boolean isLetter() {
        return Character.isLetter(this.character);
    }

    public boolean isDigit() {
        return Character.isDigit(this.character);
    }

    public boolean isLetterOrDigit() {
        if (Character.isLetter(this.character) || Character.isDigit(this.character)) {
            return true;
        }
        return false;
    }

    public MyCharacter toLowerCase() {
        char chars = Character.toLowerCase(this.character);
        MyCharacter myCharacter = new MyCharacter(chars);
        return myCharacter;
    }

    public MyCharacter toUpperCase() {
        char chars = Character.toUpperCase(this.character);
        MyCharacter myCharacter = new MyCharacter(chars);
        return myCharacter;
    }

    public char[] charArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);

        }
        return chars;
    }

    public String toString() {
        return String.valueOf(character);
    }
}
