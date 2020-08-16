package Lesson3;

public class Task5 {
    public String reversStr() {
        String result = "";
        result = reverse("Hello world!!!");
    }

    public static String reverse(String str) {
        String result = "";
        int j = (str.length () - 1);
        for (int i = 0; i < str.length (); i++) {
            result += Character.toString (str.charAt (j));
            j--;
        }
        return result;
    }
}
