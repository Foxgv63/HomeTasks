package Lesson3;

public class Task2 {
    public String printName() {
        String result = "";
        String name = "Gennady";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                result += (name + " ");
            }
            result = ("\n");
        }
        return result;
    }
}
