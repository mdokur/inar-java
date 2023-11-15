package week_10.assigments;

public class MyString2 {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MyString2() {

    }

    public MyString2(String s) {
        this.str = s;
    }

    public MyString2(char[] chars) {
        this.str = "";
        for (int i = 0; i < chars.length; i++) {
            this.str += chars[i];
        }
    }

    public int compare(String s) {
        for (int i = 0; i < this.str.length(); i++) {
            if (s.charAt(i) == this.str.charAt(i)) {
                continue;
            } else if (s.charAt(i) < this.str.charAt(i)) {
                return 1;
            } else if (s.charAt(i) > this.str.charAt(i)) {
                return -1;
            }

        }
        return 0;
    }

    public MyString2 toUpperCase() {
        char[] chars = new char[this.str.length()];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = Character.toUpperCase(this.str.charAt(j));
        }
        MyString2 myString2 = new MyString2(chars);
        return myString2;
    }

    public MyString2 substring(int begin) {
        char[] chars = new char[this.str.length() - begin];
        int count = 0;
        for (int i = begin; i < this.str.length(); i++) {
            chars[count] = str.charAt(i);
            count++;
        }

        MyString2 myString2 = new MyString2(chars);
        return myString2;
    }

    public char[] toChars() {
        char[] chars = new char[this.str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        String result = "";
        if (b) {
            result += "true";
        } else {
            result += "false";
        }
        MyString2 string = new MyString2(result);
        return string;
    }

    public String toString() {
        return str;
    }
}
