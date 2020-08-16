package Lesson3;

public class Task1 {
    public int compare() {
        int result;
        result = min1(5, 2, 3);
    }

    public static int min1(int a, int b, int c) {
        int result;
        if ((a < b) && (a < c)) {
            result = a;
        } else if ((b < a) && (b < c)) {
            result = b;
        } else {
            result = c;
        }
        return result;

    }
}
