package week_10.assigments;

public class MyString {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MyString() {
    }

    public MyString(String str) {
        this.str = str;
    }

    public MyString(char[] chars) {
        this.str = "";
        for (int i = 0; i < chars.length; i++) {
            this.str += chars[i];
        }
    }

    public char charAt(int index) {
        return this.str.charAt(index);
    }

    public int length() {
        return this.str.length();
    }

    public MyString substring(int begin, int end) {
        char[] chars = new char[end - begin];
        int count = 0;
        for (int i = begin; i < end; i++) {
            chars[count] = str.charAt(i);
            count++;
        }

        MyString myString1 = new MyString(chars);
        return myString1;
    }

    public MyString toLowerCase() {
        char[] chars = new char[this.str.length()];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = Character.toLowerCase(this.str.charAt(j));
        }
        MyString myString1 = new MyString(chars);
        return myString1;
    }

    public boolean equals(MyString s) {
        if (str.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static MyString valueOf(int i) {
        String valueOf = Integer.toString(i);
        char[] chars = new char[valueOf.length()];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = valueOf.charAt(j);
        }
        MyString myString1 = new MyString(chars);
        return myString1;

    }

    public String toString() {
        return str;
    }
}
