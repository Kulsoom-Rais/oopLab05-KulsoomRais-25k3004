import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {

        String[] names = {"Amna", "Ali", "Sana", "Kinza", "Aqsa"};

        Arrays.sort(names);
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
