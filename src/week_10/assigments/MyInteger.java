package week_10.assigments;

public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    MyInteger() {

    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (getValue() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (getValue() % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        if (getValue() == 1) {
            return false;
        }

        for (int i = 2; i < getValue() / 2; i++) {
            if (getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int value) {
        if (value == 1) {
            return false;
        }

        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        if (myInteger.getValue() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(MyInteger myInteger) {
        if (myInteger.getValue() % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(MyInteger myInteger) {
        if (myInteger.getValue() == 1) {
            return false;
        }

        for (int i = 2; i < myInteger.getValue() / 2; i++) {
            if (myInteger.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEquals(int value) {
        if (getValue() == value) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEquals(MyInteger myInteger) {
        if (myInteger.getValue() == getValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int parseInt(char[] array) {
        String value ="";
        for (int i = 0; i < array.length; i++) {
            value+=array[i] ;
        }
        int intValue= Integer.parseInt(value);
        return intValue;
    }

    public int parseInt(String str) {
        int value = Integer.parseInt(str);
        return value;
    }
}
